package com.petfriendly.repository;

import com.petfriendly.model.Categoria
import org.springframework.data.jpa.repository.JpaRepository

interface CategoriaRepository : JpaRepository<Categoria, Long> {
}