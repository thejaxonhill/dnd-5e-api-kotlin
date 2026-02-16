package com.thejaxonhill.dnd5eapi.background.application.dto

import com.thejaxonhill.dnd5eapi.background.domain.Background
import com.thejaxonhill.dnd5eapi.background.domain.Feature
import com.thejaxonhill.dnd5eapi.background.domain.StartingEquipment
import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.domain.model.Choice

data class BackgroundView(
    val index: String,
    val name: String? = null,
    val startingProficiencies: List<ApiReference>? = null,
    val languageOptions: Choice? = null,
    val startingEquipment: List<StartingEquipment>? = null,
    val startingEquipmentOptions: List<Choice>? = null,
    val feature: Feature? = null,
    val personalityTraits: Choice? = null,
    val ideals: Choice? = null,
    val bonds: Choice? = null,
    val flaws: Choice? = null,
    val url: String? = null,
)

fun Background.toView() = BackgroundView(
    index = index,
    name = name,
    startingProficiencies = startingProficiencies,
    languageOptions = languageOptions,
    startingEquipment = startingEquipment,
    startingEquipmentOptions = startingEquipmentOptions,
    feature = feature,
    personalityTraits = personalityTraits,
    ideals = ideals,
    bonds = bonds,
    flaws = flaws,
    url = url,
)
