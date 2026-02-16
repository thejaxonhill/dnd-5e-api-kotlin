package com.thejaxonhill.dnd5eapi.characterclass.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.characterclass.domain.EquipmentQuantity
import com.thejaxonhill.dnd5eapi.characterclass.domain.MultiClassing
import com.thejaxonhill.dnd5eapi.characterclass.domain.Spellcasting
import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.domain.model.Choice
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document(collection = "classes")
class CharacterClassDocument(
    @Id
    var id: String? = null,
    var classLevels: String? = null,
    var hitDie: Int? = null,
    var index: String? = null,
    var name: String? = null,
    var proficiencies: List<ApiReference>? = null,
    var proficiencyChoices: List<Choice>? = null,
    var savingThrows: List<ApiReference>? = null,
    var spellcasting: Spellcasting? = null,
    var spells: String? = null,
    var startingEquipment: List<EquipmentQuantity>? = null,
    var startingEquipmentOptions: List<Choice>? = null,
    var multiClassing: MultiClassing? = null,
    var subclasses: List<ApiReference>? = null,
    var url: String? = null,
    var updatedAt: LocalDateTime? = null
)