package com.thejaxonhill.dnd5eapi.subrace.application.usecase

import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase
import com.thejaxonhill.dnd5eapi.subrace.domain.repository.SubraceRepository

@UseCase
class LoadSubraces(private val subraceRepository: SubraceRepository) {
    fun load() = subraceRepository.loadAll()
}