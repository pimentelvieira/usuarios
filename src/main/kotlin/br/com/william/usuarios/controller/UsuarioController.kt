package br.com.william.usuarios.controller

import br.com.william.usuarios.model.Usuario
import br.com.william.usuarios.service.UsuarioService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("usuario")
class UsuarioController {

    @Autowired
    lateinit var usuarioService: UsuarioService

    @GetMapping
    fun getPorLoginESenha(@RequestParam("login") login: String, @RequestParam("senha") senha: String): Usuario? {
        return usuarioService.buscarPorLoginESenha(login, senha)
    }
    @PostMapping
    fun add(@RequestBody usuario:Usuario): Usuario {
        return usuarioService.salvar(usuario)
    }

    @GetMapping("todos")
    fun list(): List<Usuario> {
        return usuarioService.buscarTodos()
    }
}