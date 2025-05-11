package com.thejaxonhill.dnd5eapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Dnd5eApiApplication

fun main(args: Array<String>) {
    runApplication<Dnd5eApiApplication>(*args)
}
