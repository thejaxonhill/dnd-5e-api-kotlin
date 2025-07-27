package com.thejaxonhill.dnd5eapi.feature.application.usecase

import com.thejaxonhill.dnd5eapi.feature.domain.repository.FeatureRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadFeatures(private val featureRepository: FeatureRepository) {
    fun load() = featureRepository.loadAll()
}