package com.thejaxonhill.dnd5eapi.feat.application.usecase

import com.thejaxonhill.dnd5eapi.feat.application.dto.toView
import com.thejaxonhill.dnd5eapi.feat.domain.repository.FeatRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadFeatByIndex(private val featRepository: FeatRepository) {
    fun load(index: String) = featRepository.loadByIndex(index)?.toView() ?: throw NoSuchElementException()
}