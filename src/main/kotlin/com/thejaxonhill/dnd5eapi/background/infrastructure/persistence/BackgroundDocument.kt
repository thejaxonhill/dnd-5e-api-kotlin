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
    var id: String? = null,
    var index: String? = null,
    var name: String? = null,
    var startingProficiencies: List<ApiReference>? = null,
    var languageOptions: Choice? = null,
    var startingEquipment: List<StartingEquipment>? = null,
    var startingEquipmentOptions: List<Choice>? = null,
    var feature: Feature? = null,
    var personalityTraits: Choice? = null,
    var ideals: Choice? = null,
    var bonds: Choice? = null,
    var flaws: Choice? = null,
    var url: String? = null,
    var updatedAt: Date? = null
)