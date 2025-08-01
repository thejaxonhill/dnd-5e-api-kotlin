package com.thejaxonhill.dnd5eapi.spell.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.domain.model.AreaOfEffect
import com.thejaxonhill.dnd5eapi.spell.domain.model.SpellDamage
import com.thejaxonhill.dnd5eapi.spell.domain.model.SpellDc
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "spells")
class SpellDocument(
    @Id
    val id: String? = null,
    val areaOfEffect: AreaOfEffect? = null,
    val attackType: String? = null,
    val castingTime: String,
    val classes: List<ApiReference>,
    val components: List<String>,
    val concentration: Boolean,
    val damage: SpellDamage? = null,
    val dc: SpellDc? = null,
    val desc: List<String>,
    val duration: String,
    val healAtSlotLevel: Map<Int, String>? = null,
    val higherLevel: List<String>? = null,
    val index: String,
    val level: Int,
    val material: String? = null,
    val name: String,
    val range: String,
    val ritual: Boolean,
    val school: ApiReference,
    val subclasses: List<ApiReference>,
    val url: String,
    val updatedAt: Date,
)
