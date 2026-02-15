package com.thejaxonhill.dnd5eapi.race.application.usecase

import com.thejaxonhill.dnd5eapi.race.application.dto.toView
import com.thejaxonhill.dnd5eapi.race.domain.repository.RaceRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadRaceByIndex(private val raceRepository: RaceRepository) {
    fun load(index: String) = raceRepository.loadByIndex(index)?.toView() ?: throw NoSuchElementException()
}