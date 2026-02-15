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
data class LevelDocument(
    @Id
    val id: String? = null,
    val abilityScoreBonuses: Long? = null,
    @Field("class")
    val characterClass: ApiReference? = null,
    val classSpecific: ClassSpecific? = null,
    val features: List<ApiReference>? = null,
    val index: String? = null,
    val level: Int? = null,
    val profBonus: Int? = null,
    val spellcasting: SpellcastingSlots? = null,
    val subclass: ApiReference? = null,
    val subclassSpecific: SubclassSpecific? = null,
    val url: String? = null,
    val updatedAt: Date? = null
)