package com.thejaxonhill.dnd5eapi.background

import com.thejaxonhill.dnd5eapi.shared.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.model.Choice
import java.util.*

data class Background(
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
    val updatedAt: Date
)
