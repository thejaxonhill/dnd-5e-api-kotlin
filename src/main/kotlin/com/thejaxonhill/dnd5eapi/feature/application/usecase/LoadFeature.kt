package com.thejaxonhill.dnd5eapi.feature.application.usecase

import com.thejaxonhill.dnd5eapi.feature.domain.repository.FeatureRepository
import com.thejaxonhill.dnd5eapi.shared.application.exception.NotFoundException
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadFeature(private val featureRepository: FeatureRepository) {
    fun load(index: String) = featureRepository.loadByIndex(index) ?: throw NotFoundException()
}