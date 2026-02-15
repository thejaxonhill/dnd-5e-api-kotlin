package com.thejaxonhill.dnd5eapi.background.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.background.domain.model.Feature
import com.thejaxonhill.dnd5eapi.background.domain.model.StartingEquipment
import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.domain.model.Choice
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "backgrounds")
data class BackgroundDocument(
    @Id
    val id: String? = null,
    val index: String? = null,
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
    val updatedAt: Date? = null
)