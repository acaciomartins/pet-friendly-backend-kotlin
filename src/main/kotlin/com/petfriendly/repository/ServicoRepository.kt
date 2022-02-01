package com.petfriendly.repository;

import com.petfriendly.model.Servico
import org.springframework.data.jpa.repository.JpaRepository

interface ServicoRepository : JpaRepository<Servico, Long> {
}