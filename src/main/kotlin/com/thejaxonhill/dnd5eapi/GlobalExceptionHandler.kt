package com.thejaxonhill.dnd5eapi

import com.thejaxonhill.dnd5eapi.shared.application.exception.NotFoundException
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.servlet.resource.NoResourceFoundException

@RestControllerAdvice
class GlobalExceptionHandler {
    @ExceptionHandler(value = [RuntimeException::class])
    fun handleRuntimeException(runtimeException: RuntimeException): ResponseEntity<Any> =
        ResponseEntity.badRequest().body(runtimeException.message)

    @ExceptionHandler(value = [NotFoundException::class, NoResourceFoundException::class])
    fun handleNotFoundException(): ResponseEntity<Any> =
        ResponseEntity.notFound().build()
}