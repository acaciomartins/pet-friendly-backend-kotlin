package com.petfriendly.repository;

import com.petfriendly.model.Regra
import org.springframework.data.jpa.repository.JpaRepository

interface RegraRepository : JpaRepository<Regra, Long> {
}