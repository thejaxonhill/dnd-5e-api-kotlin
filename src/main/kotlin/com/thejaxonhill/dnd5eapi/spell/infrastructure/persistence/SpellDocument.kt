package com.thejaxonhill.dnd5eapi.spell.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.domain.model.AreaOfEffect
import com.thejaxonhill.dnd5eapi.spell.domain.model.SpellDamage
import com.thejaxonhill.dnd5eapi.spell.domain.model.SpellDc
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "spells")
data class SpellDocument(
    @Id
    val id: String? = null,
    val areaOfEffect: AreaOfEffect? = null,
    val attackType: String? = null,
    val castingTime: String? = null,
    val classes: List<ApiReference>? = null,
    val components: List<String>? = null,
    val concentration: Boolean? = null,
    val damage: SpellDamage? = null,
    val dc: SpellDc? = null,
    val desc: List<String>? = null,
    val duration: String? = null,
    val healAtSlotLevel: Map<Int, String>? = null,
    val higherLevel: List<String>? = null,
    val index: String? = null,
    val level: Int? = null,
    val material: String? = null,
    val name: String? = null,
    val range: String? = null,
    val ritual: Boolean? = null,
    val school: ApiReference? = null,
    val subclasses: List<ApiReference>? = null,
    val url: String? = null,
    val updatedAt: Date? = null
)
