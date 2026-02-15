package com.thejaxonhill.dnd5eapi.magicitem.application.usecase

import com.thejaxonhill.dnd5eapi.magicitem.application.dto.toView
import com.thejaxonhill.dnd5eapi.magicitem.domain.model.MagicItemExample
import com.thejaxonhill.dnd5eapi.magicitem.domain.repository.MagicItemRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page

@UseCase
class LoadMagicItems(private val magicItemRepository: MagicItemRepository) {
    fun load(page: Page, example: MagicItemExample?) =
        magicItemRepository.loadAll(page, example).map { it.toView() }
}