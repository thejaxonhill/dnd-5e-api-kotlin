package com.thejaxonhill.dnd5eapi.subclass.application.usecase

import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase
import com.thejaxonhill.dnd5eapi.subclass.domain.repository.SubclassRepository

@UseCase
class LoadSubclasses(private val subclassRepository: SubclassRepository) {
    fun load() = subclassRepository.loadAll()
}