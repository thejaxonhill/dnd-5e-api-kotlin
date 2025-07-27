package com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter

import com.thejaxonhill.dnd5eapi.shared.domain.model.*
import org.bson.Document
import org.springframework.core.convert.converter.Converter
import org.springframework.data.convert.ReadingConverter

fun Document.getChoice(key: String) = getDocument(key)?.toChoice()

fun Document.toChoice() = Choice(
    desc = getString("desc"),
    choose = getInteger("choose"),
    type = getString("type"),
    from = getOptionSet("from")!!
)

fun Document.getOptionSet(key: String) = getDocument(key)?.toOptionSet()

fun Document.toOptionSet() = when (getString("option_set_type")) {
    "options_array" -> OptionsArrayOptionSet(
        options = getDocumentList("options")?.mapNotNull {
            it.toOption()
        }
    )

    "equipment_category" -> EquipmentCategoryOptionSet(
        equipmentCategory = getApiReference("equipment_category")!!
    )

    "resource_list" -> ResourceListOptionSet(
        resourceListUrl = getString("resource_list_url")
    )

    else -> null
}

fun Document.toOption(): Option? = when (getString("option_type")) {
    "ability_bonus" -> AbilityBonusOption(
        abilityScore = getApiReference("ability_score")!!,
        bonus = getInteger("bonus")
    )

    "action" -> com.thejaxonhill.dnd5eapi.shared.domain.model.ActionOption(
        actionName = getString("action_name"),
        count = getInteger("count"),
        type = ActionType.fromString(getString("type"))!!,
        notes = getString("notes")
    )

    "breath" -> BreathOption(
        name = getString("name"),
        dt = getDocument("dt")?.let {
            DifficultyClass(
                dcType = it.getApiReference("dc_type")!!,
                dcValue = it.getInteger("dc_value"),
                successType = com.thejaxonhill.dnd5eapi.shared.domain.model.SuccessType.fromString(it.getString("success_type")),
            )
        },
        damage = getDocumentList("damage")?.map {
            Damage(
                damageDice = it.getString("damage_dice"),
                damageType = it.getApiReference("damage_type")!!
            )
        }
    )

    "choice" -> com.thejaxonhill.dnd5eapi.shared.domain.model.ChoiceOption(choice = getChoice("choice")!!)
    "counted_reference" -> com.thejaxonhill.dnd5eapi.shared.domain.model.CountedReferenceOption(
        count = getInteger("count"),
        of = getApiReference("of")!!,
        prerequisites = getDocumentList("prerequisites")?.mapNotNull {
            when (it.getString("type")) {
                "proficiency" -> ProficiencyPrerequisite(
                    proficiency = it.getApiReference("proficiency")
                )

                else -> null
            }
        }
    )

    "damage" -> com.thejaxonhill.dnd5eapi.shared.domain.model.DamageOption(
        damageType = getApiReference("damage_type")!!,
        damageDice = getString("damage_dice"),
        notes = getString("notes")
    )

    "ideal" -> IdealOption(
        desc = getString("desc"),
        alignments = getDocumentList("alignments")?.map {
            it.toApiReference()
        } ?: emptyList()
    )

    "multiple" -> MultipleOption(
        items = getDocumentList("options")?.mapNotNull {
            it.toOption()
        } ?: emptyList()
    )

    "reference" -> ReferenceOption(
        item = getApiReference("item")!!,
    )

    "score_prerequisite" -> com.thejaxonhill.dnd5eapi.shared.domain.model.ScorePrerequisiteOption(
        abilityScore = getApiReference("ability_score")!!,
        minimumScore = getInteger("minimum_score")
    )

    "string" -> StringOption(
        string = getString("string"),
    )

    else -> null
}

@ReadingConverter
class ChoiceReadingConverter : Converter<Document, Choice> {
    override fun convert(source: Document) = source.toChoice()
}