package com.thejaxonhill.dnd5eapi.shared.port

interface LoadPort<T> {
    fun loadByIndex(index: String): T?
    fun loadAll(): List<T>
}