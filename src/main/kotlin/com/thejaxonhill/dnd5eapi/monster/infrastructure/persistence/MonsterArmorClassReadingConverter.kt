package com.thejaxonhill.dnd5eapi.monster.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.monster.domain.model.*
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.getApiReference
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.getDocumentList
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toApiReference
import org.bson.Document
import org.springframework.core.convert.converter.Converter
import org.springframework.data.convert.ReadingConverter

fun Document.toMonsterArmorClass() = when (getString("type")) {
    "armor" -> ArmorClassArmor(
        value = getInteger("value"),
        armor = getDocumentList("armor")?.map { it.toApiReference() },
        desc = getString("desc")
    )

    "condition" -> ArmorClassCondition(
        value = getInteger("value"),
        condition = getApiReference("condition")!!,
        desc = getString("desc"),
    )

    "dex" -> ArmorClassDex(
        value = getInteger("value"),
        desc = getString("desc")
    )

    "natural" -> ArmorClassNatural(
        value = getInteger("value"),
        desc = getString("desc"),
    )

    "spell" -> ArmorClassSpell(
        value = getInteger("value"),
        spell = getApiReference("spell")!!,
        desc = getString("desc"),
    )

    else -> null
}

@ReadingConverter
class MonsterArmorClassReadingConverter : Converter<Document, MonsterArmorClass> {
    override fun convert(source: Document): MonsterArmorClass? = source.toMonsterArmorClass()
}