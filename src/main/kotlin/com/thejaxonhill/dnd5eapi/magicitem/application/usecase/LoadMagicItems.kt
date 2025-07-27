package com.thejaxonhill.dnd5eapi.magicitem.application.usecase

import com.thejaxonhill.dnd5eapi.magicitem.domain.repository.MagicItemRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadMagicItems(private val magicItemRepository: MagicItemRepository) {
    fun load() = magicItemRepository.loadAll()
}