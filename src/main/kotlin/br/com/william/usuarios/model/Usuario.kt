package br.com.william.usuarios.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document()
data class Usuario (@Id var id: String?,
                  var login: String,
                  var senha: String) {

    constructor() : this("", "", "")
}