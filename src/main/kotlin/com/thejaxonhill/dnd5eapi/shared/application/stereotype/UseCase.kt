package com.thejaxonhill.dnd5eapi.shared.application.stereotype

import org.springframework.stereotype.Service

@Service
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class UseCase()
