package com.thejaxonhill.dnd5eapi.background.application.usecase

import com.thejaxonhill.dnd5eapi.background.application.dto.toView
import com.thejaxonhill.dnd5eapi.background.domain.repository.BackgroundRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadBackgroundByIndex(private val backgroundRepository: BackgroundRepository) {
    fun load(index: String) = backgroundRepository.loadByIndex(index)?.toView() ?: throw NoSuchElementException()
}