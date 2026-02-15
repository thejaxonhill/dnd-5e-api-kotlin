package com.thejaxonhill.dnd5eapi.race.domain.repository

import com.thejaxonhill.dnd5eapi.race.domain.model.Race
import com.thejaxonhill.dnd5eapi.race.domain.model.RaceExample
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel

interface RaceRepository {
    fun load(id: String): Race?
    fun loadByIndex(index: String): Race?
    fun loadAll(page: Page, example: RaceExample? = null): PagedModel<Race>
    fun save(race: Race): Race
}