package com.petfriendly.model

import javax.persistence.*

@Entity
data class Servico(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(length = 255, nullable = false, unique = true)
    var nome: String,

    var status: Boolean,

    @ManyToMany(mappedBy = "servicos")
    var usuarios: List<Usuario>
)
