package com.thejaxonhill.dnd5eapi.background.port

import com.thejaxonhill.dnd5eapi.background.Background

interface LoadBackgroundPort {
    fun loadByIndex(index: String): Background?
    fun loadAll(): List<Background>
}