package com.petfriendly.model

import javax.persistence.*

@Entity
data class Regra(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(length = 255, nullable = false, unique = true)
    var nome: String,

    var status: Boolean,

    @ManyToMany(mappedBy = "regras")
    var usuarios: List<Usuario>
)
