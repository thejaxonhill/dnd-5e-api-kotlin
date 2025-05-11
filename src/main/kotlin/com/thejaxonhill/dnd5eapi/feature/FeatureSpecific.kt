package com.thejaxonhill.dnd5eapi.feature

import com.thejaxonhill.dnd5eapi.shared.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.model.Choice

data class FeatureSpecific(
    val subfeatureOptions: Choice?,
    val expertiseOptions: Choice?,
    val invocations: List<ApiReference>?
)
