package br.com.william.usuarios.service

import br.com.william.usuarios.model.Usuario
import br.com.william.usuarios.repository.UsuarioRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UsuarioService {

    @Autowired
    lateinit var usuarioRepository: UsuarioRepository

    fun salvar(usuario: Usuario):Usuario {
        usuarioRepository.save(usuario)
        return usuario
    }

    fun buscarPorLoginESenha(login: String, senha: String) : Usuario {
        return usuarioRepository.findByLoginAndSenha(login, senha)
    }

    fun buscarTodos() : List<Usuario> {
        return usuarioRepository.findAll()
    }
}