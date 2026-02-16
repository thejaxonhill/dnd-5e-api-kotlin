package com.thejaxonhill.dnd5eapi.feature.application.usecase

import com.thejaxonhill.dnd5eapi.feature.application.dto.toView
import com.thejaxonhill.dnd5eapi.feature.domain.FeatureExample
import com.thejaxonhill.dnd5eapi.feature.domain.FeatureRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page

@UseCase
class LoadFeatures(private val featureRepository: FeatureRepository) {
    fun load(page: Page, example: FeatureExample?) =
        featureRepository.loadAll(page, example).map { it.toView() }
}