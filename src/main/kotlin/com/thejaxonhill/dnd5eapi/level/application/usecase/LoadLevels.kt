package com.thejaxonhill.dnd5eapi.level.application.usecase

import com.thejaxonhill.dnd5eapi.level.domain.repository.LevelRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadLevels(private val levelRepository: LevelRepository) {
    fun load() = levelRepository.loadAll()
}