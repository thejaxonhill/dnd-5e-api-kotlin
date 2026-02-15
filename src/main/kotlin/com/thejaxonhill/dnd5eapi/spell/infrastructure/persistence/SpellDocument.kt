package com.thejaxonhill.dnd5eapi.spell.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.domain.model.AreaOfEffect
import com.thejaxonhill.dnd5eapi.spell.domain.model.SpellDamage
import com.thejaxonhill.dnd5eapi.spell.domain.model.SpellDc
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document(collection = "spells")
class SpellDocument(
    @Id
    var id: String? = null,
    var areaOfEffect: AreaOfEffect? = null,
    var attackType: String? = null,
    var castingTime: String? = null,
    var classes: List<ApiReference>? = null,
    var components: List<String>? = null,
    var concentration: Boolean? = null,
    var damage: SpellDamage? = null,
    var dc: SpellDc? = null,
    var desc: List<String>? = null,
    var duration: String? = null,
    var healAtSlotLevel: Map<Int, String>? = null,
    var higherLevel: List<String>? = null,
    var index: String? = null,
    var level: Int? = null,
    var material: String? = null,
    var name: String? = null,
    var range: String? = null,
    var ritual: Boolean? = null,
    var school: ApiReference? = null,
    var subclasses: List<ApiReference>? = null,
    var url: String? = null,
    var updatedAt: LocalDateTime? = null
)
