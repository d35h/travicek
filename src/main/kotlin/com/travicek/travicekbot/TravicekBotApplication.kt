package com.travicek.travicekbot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TravicekBotApplication

fun main(args: Array<String>) {
	runApplication<TravicekBotApplication>(*args)
}
