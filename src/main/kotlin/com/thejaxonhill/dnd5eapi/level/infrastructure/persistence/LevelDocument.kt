package com.thejaxonhill.dnd5eapi.level.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.level.domain.model.ClassSpecific
import com.thejaxonhill.dnd5eapi.level.domain.model.SpellcastingSlots
import com.thejaxonhill.dnd5eapi.level.domain.model.SubclassSpecific
import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import java.util.*

@Document(collection = "levels")
class LevelDocument(
    @Id
    val id: String? = null,
    val abilityScoreBonuses: Long? = null,
    @Field("class")
    val characterClass: ApiReference,
    val classSpecific: ClassSpecific? = null,
    val features: List<ApiReference>,
    val index: String,
    val level: Int,
    val profBonus: Int? = null,
    val spellcasting: SpellcastingSlots? = null,
    val subclass: ApiReference?,
    val subclassSpecific: SubclassSpecific?,
    val url: String,
    val updatedAt: Date,
)