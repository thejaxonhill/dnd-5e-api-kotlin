package com.thejaxonhill.dnd5eapi.race.application.usecase

import com.thejaxonhill.dnd5eapi.race.application.dto.toView
import com.thejaxonhill.dnd5eapi.race.domain.model.RaceExample
import com.thejaxonhill.dnd5eapi.race.domain.repository.RaceRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page

@UseCase
class LoadRaces(private val raceRepository: RaceRepository) {
    fun load(page: Page, example: RaceExample?) =
        raceRepository.loadAll(page, example).map { it.toView() }
}