package com.petfriendly.model


import javax.persistence.*

@Entity(name = "categoria")
data class Categoria(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(length = 100, nullable = false, unique = true)
    var nome: String,

    var status: Boolean
)