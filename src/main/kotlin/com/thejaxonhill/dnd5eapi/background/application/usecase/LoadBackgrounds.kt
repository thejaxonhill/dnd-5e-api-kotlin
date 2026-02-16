package com.thejaxonhill.dnd5eapi.background.application.usecase

import com.thejaxonhill.dnd5eapi.background.application.dto.toView
import com.thejaxonhill.dnd5eapi.background.domain.BackgroundExample
import com.thejaxonhill.dnd5eapi.background.domain.BackgroundRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page

@UseCase
class LoadBackgrounds(private val backgroundRepository: BackgroundRepository) {
    fun load(page: Page, example: BackgroundExample?) =
        backgroundRepository.loadAll(page, example).map { it.toView() }
}