package com.thejaxonhill.dnd5eapi.race.application.usecase

import com.thejaxonhill.dnd5eapi.race.domain.repository.RaceRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadRaces(private val raceRepository: RaceRepository) {
    fun load() = raceRepository.loadAll()
}