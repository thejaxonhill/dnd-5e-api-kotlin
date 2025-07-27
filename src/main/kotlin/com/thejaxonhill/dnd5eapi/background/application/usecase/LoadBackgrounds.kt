package com.thejaxonhill.dnd5eapi.background.application.usecase

import com.thejaxonhill.dnd5eapi.background.domain.repository.BackgroundRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadBackgrounds(private val backgroundRepository: BackgroundRepository) {
    fun load() = backgroundRepository.loadAll()
}