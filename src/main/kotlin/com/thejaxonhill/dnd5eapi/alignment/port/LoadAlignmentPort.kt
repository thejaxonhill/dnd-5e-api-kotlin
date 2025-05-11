package com.thejaxonhill.dnd5eapi.alignment.port

import com.thejaxonhill.dnd5eapi.alignment.Alignment

interface LoadAlignmentPort {
    fun loadByIndex(index: String): Alignment?
    fun loadAll(): List<Alignment>
}