package com.thejaxonhill.dnd5eapi.background.application.dto

import com.thejaxonhill.dnd5eapi.background.domain.model.Background
import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.domain.model.Choice
import java.time.LocalDateTime

data class BackgroundView(
    val index: String,
    val name: String,
    val startingProficiencies: List<ApiReference>,
    val languageOptions: Choice,
    val startingEquipment: List<StartingEquipment>,
    val startingEquipmentOptions: List<Choice>,
    val feature: Feature,
    val personalityTraits: Choice,
    val ideals: Choice,
    val bonds: Choice,
    val flaws: Choice,
    val url: String,
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
