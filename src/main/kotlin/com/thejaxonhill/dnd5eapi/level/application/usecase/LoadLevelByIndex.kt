package com.thejaxonhill.dnd5eapi.level.application.usecase

import com.thejaxonhill.dnd5eapi.level.application.dto.toView
import com.thejaxonhill.dnd5eapi.level.domain.LevelRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadLevelByIndex(private val levelRepository: LevelRepository) {
    fun load(index: String) = levelRepository.loadByIndex(index)?.toView() ?: throw NoSuchElementException()
}