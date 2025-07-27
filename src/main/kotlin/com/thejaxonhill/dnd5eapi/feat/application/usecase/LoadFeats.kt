package com.thejaxonhill.dnd5eapi.feat.application.usecase

import com.thejaxonhill.dnd5eapi.feat.domain.repository.FeatRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadFeats(private val featRepository: FeatRepository) {
    fun load() = featRepository.loadAll()
}