package com.thejaxonhill.dnd5eapi.shared.converter

import kotlin.reflect.KClass
import kotlin.reflect.full.memberProperties
import kotlin.reflect.full.primaryConstructor

inline fun <reified T : Any> Any.mapTo() = mapTo(T::class)

fun <T : Any> Any.mapTo(targetClass: KClass<T>): T {
    val sourceProperties = this::class.memberProperties
    val targetConstructor = targetClass.primaryConstructor
        ?: throw IllegalArgumentException("Primary constructor not found for ${targetClass.simpleName}")

    val arguments = targetConstructor.parameters.associateWith { param ->
        sourceProperties.find { it.name == param.name }?.call(this)
    }

    return targetConstructor.callBy(arguments)
}