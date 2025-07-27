package com.thejaxonhill.dnd5eapi.subclass.application.usecase

import com.thejaxonhill.dnd5eapi.shared.application.exception.NotFoundException
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase
import com.thejaxonhill.dnd5eapi.subclass.domain.repository.SubclassRepository

@UseCase
class LoadSubclass(private val subclassRepository: SubclassRepository) {
    fun load(index: String) = subclassRepository.loadByIndex(index) ?:
    throw NotFoundException()
}