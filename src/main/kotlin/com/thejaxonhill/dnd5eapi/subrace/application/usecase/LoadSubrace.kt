package com.thejaxonhill.dnd5eapi.subrace.application.usecase

import com.thejaxonhill.dnd5eapi.shared.application.exception.NotFoundException
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase
import com.thejaxonhill.dnd5eapi.subrace.domain.repository.SubraceRepository

@UseCase
class LoadSubrace(private val subraceRepository: SubraceRepository) {
    fun load(index: String) = subraceRepository.loadByIndex(index) ?:
    throw NotFoundException()
}