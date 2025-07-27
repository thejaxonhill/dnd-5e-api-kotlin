package com.thejaxonhill.dnd5eapi.level.application.usecase

import com.thejaxonhill.dnd5eapi.level.domain.repository.LevelRepository
import com.thejaxonhill.dnd5eapi.shared.application.exception.NotFoundException
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadLevel(private val levelRepository: LevelRepository) {
    fun load(index: String) = levelRepository.loadByIndex(index) ?: throw NotFoundException()
}