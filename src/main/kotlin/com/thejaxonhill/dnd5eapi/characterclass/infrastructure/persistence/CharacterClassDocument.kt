package com.thejaxonhill.dnd5eapi.characterclass.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.characterclass.domain.model.CharacterClassSpellcasting
import com.thejaxonhill.dnd5eapi.characterclass.domain.model.EquipmentQuantity
import com.thejaxonhill.dnd5eapi.characterclass.domain.model.MultiClassing
import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.domain.model.Choice
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "classes")
data class CharacterClassDocument(
    @Id
    val id: String? = null,
    val classLevels: String? = null,
    val hitDie: Int? = null,
    val index: String? = null,
    val name: String? = null,
    val proficiencies: List<ApiReference>? = null,
    val proficiencyChoices: List<Choice>? = null,
    val savingThrows: List<ApiReference>? = null,
    val spellcasting: CharacterClassSpellcasting? = null,
    val spells: String? = null,
    val startingEquipment: List<EquipmentQuantity>? = null,
    val startingEquipmentOptions: List<Choice>? = null,
    val multiClassing: MultiClassing? = null,
    val subclasses: List<ApiReference>? = null,
    val url: String? = null,
    val updatedAt: Date? = null
)