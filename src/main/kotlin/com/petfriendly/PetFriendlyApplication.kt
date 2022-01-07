package com.petfriendly

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PetFriendlyApplication

fun main(args: Array<String>) {
	runApplication<PetFriendlyApplication>(*args)
}
