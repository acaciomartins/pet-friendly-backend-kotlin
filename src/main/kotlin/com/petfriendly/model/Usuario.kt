package com.petfriendly.model

import java.math.BigDecimal
import javax.persistence.*

@Entity
data class Usuario(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,

    @Column(length = 100, nullable = false)
    var nome: String,

    @Column(length = 25)
    var telefone: String,

    @Column(length = 255, nullable = false)
    var email: String,

    @Column(precision = 12, scale = 2)
    var taxa: BigDecimal,

    var longitude: Int,

    var latitude: Int,

    var status: Boolean,

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    var categoria: Categoria,

    @ManyToMany(cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    @JoinTable(
        name = "usuario_regra",
        joinColumns = [JoinColumn(name = "usuario_id")],
        inverseJoinColumns = [JoinColumn(name = "regra_id")]
    )
    var regras: List<Regra>,

    @ManyToMany(cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    @JoinTable(
        name = "usuario_servico",
        joinColumns = [JoinColumn(name = "usuario_id")],
        inverseJoinColumns = [JoinColumn(name = "servico_id")]
    )
    var servicos: List<Servico>
)
