package com.thejaxonhill.dnd5eapi.magicitem.application.usecase

import com.thejaxonhill.dnd5eapi.magicitem.domain.repository.MagicItemRepository
import com.thejaxonhill.dnd5eapi.shared.application.exception.NotFoundException
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadMagicItem(private val magicItemRepository: MagicItemRepository) {
    fun load(index: String) = magicItemRepository.loadByIndex(index) ?: throw NotFoundException()
}