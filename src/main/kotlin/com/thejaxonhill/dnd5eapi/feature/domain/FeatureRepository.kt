package com.thejaxonhill.dnd5eapi.feature.domain

import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel

interface FeatureRepository {
    fun load(id: String): Feature?
    fun loadByIndex(index: String): Feature?
    fun loadAll(page: Page, example: FeatureExample? = null): PagedModel<Feature>
    fun save(feature: Feature): Feature
}