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
class CharacterClassDocument(
    @Id
    val id: String? = null,
    val classLevels: String,
    val hitDie: Int,
    val index: String,
    val name: String,
    val proficiencies: List<ApiReference>,
    val proficiencyChoices: List<Choice>,
    val savingThrows: List<ApiReference>,
    val spellcasting: CharacterClassSpellcasting?,
    val spells: String?,
    val startingEquipment: List<EquipmentQuantity>?,
    val startingEquipmentOptions: List<Choice>,
    val multiClassing: MultiClassing,
    val subclasses: List<ApiReference>,
    val url: String,
    val updatedAt: Date
)