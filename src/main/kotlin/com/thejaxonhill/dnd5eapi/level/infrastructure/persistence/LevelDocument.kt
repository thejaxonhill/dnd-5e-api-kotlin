package com.thejaxonhill.dnd5eapi.level.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.level.domain.ClassSpecific
import com.thejaxonhill.dnd5eapi.level.domain.SpellcastingSlots
import com.thejaxonhill.dnd5eapi.level.domain.SubclassSpecific
import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import java.time.LocalDateTime

@Document(collection = "levels")
class LevelDocument(
    @Id
    var id: String? = null,
    var abilityScoreBonuses: Long? = null,
    @Field("class")
    var characterClass: ApiReference? = null,
    var classSpecific: ClassSpecific? = null,
    var features: List<ApiReference>? = null,
    var index: String? = null,
    var level: Int? = null,
    var profBonus: Int? = null,
    var spellcasting: SpellcastingSlots? = null,
    var subclass: ApiReference? = null,
    var subclassSpecific: SubclassSpecific? = null,
    var url: String? = null,
    var updatedAt: LocalDateTime? = null
)