package com.thejaxonhill.dnd5eapi

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class GlobalExceptionHandler {
    @ExceptionHandler(value = [RuntimeException::class])
    fun handleRuntimeException(e: RuntimeException): ResponseEntity<ErrorResponse> =
        ResponseEntity.badRequest().body(e.toErrorResponse())

    @ExceptionHandler(value = [Exception::class])
    fun handleException(e: Exception): ResponseEntity<ErrorResponse> =
        ResponseEntity.internalServerError().body(e.toErrorResponse())

    @ExceptionHandler(value = [NoSuchElementException::class])
    fun handleNoSuchElementException(): ResponseEntity<Void> = ResponseEntity.notFound().build()
}

fun Exception.toErrorResponse() = ErrorResponse(message ?: "An unexpected error occurred", 500)

data class ErrorResponse(val message: String, val status: Int)