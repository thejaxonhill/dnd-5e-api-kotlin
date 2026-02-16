package com.thejaxonhill.dnd5eapi.level.application.usecase

import com.thejaxonhill.dnd5eapi.level.application.dto.toView
import com.thejaxonhill.dnd5eapi.level.domain.LevelExample
import com.thejaxonhill.dnd5eapi.level.domain.LevelRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page

@UseCase
class LoadLevels(private val levelRepository: LevelRepository) {
    fun load(page: Page, example: LevelExample?) =
        levelRepository.loadAll(page, example).map { it.toView() }
}