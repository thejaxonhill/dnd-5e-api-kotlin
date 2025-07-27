package com.thejaxonhill.dnd5eapi.feature.domain.model

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.domain.model.Choice

data class FeatureSpecific(
    val subfeatureOptions: Choice?,
    val expertiseOptions: Choice?,
    val invocations: List<ApiReference>?
)
