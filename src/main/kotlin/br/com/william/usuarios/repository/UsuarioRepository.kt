package br.com.william.usuarios.repository

import br.com.william.usuarios.model.Usuario
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UsuarioRepository : MongoRepository<Usuario, String> {
    fun findByLoginAndSenha(login: String, senha: String) : Usuario
}