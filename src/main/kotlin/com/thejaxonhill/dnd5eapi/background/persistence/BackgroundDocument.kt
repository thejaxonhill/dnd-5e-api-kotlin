package com.thejaxonhill.dnd5eapi.background.persistence

import com.thejaxonhill.dnd5eapi.background.Feature
import com.thejaxonhill.dnd5eapi.background.StartingEquipment
import com.thejaxonhill.dnd5eapi.shared.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.model.Choice
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "backgrounds")
class BackgroundDocument(
    @Id
    val id: String? = null,
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