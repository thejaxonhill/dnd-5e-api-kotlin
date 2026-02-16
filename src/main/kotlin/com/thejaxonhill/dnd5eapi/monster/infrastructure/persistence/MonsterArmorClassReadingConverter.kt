package com.thejaxonhill.dnd5eapi.monster.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.monster.domain.ArmorClassType
import com.thejaxonhill.dnd5eapi.monster.domain.MonsterArmorClass
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.getApiReference
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.getDocumentList
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toApiReference
import org.bson.Document
import org.springframework.core.convert.converter.Converter
import org.springframework.data.convert.ReadingConverter

fun Document.toMonsterArmorClass() = when (ArmorClassType.fromWireName(getString("type"))) {
    ArmorClassType.ARMOR -> MonsterArmorClass.Armor(
        value = getInteger("value"),
        armor = getDocumentList("armor")?.map { it.toApiReference() },
        desc = getString("desc")
    )

    ArmorClassType.CONDITION  -> MonsterArmorClass.Condition(
        value = getInteger("value"),
        condition = getApiReference("condition")!!,
        desc = getString("desc"),
    )

    ArmorClassType.DEX -> MonsterArmorClass.Dex(
        value = getInteger("value"),
        desc = getString("desc")
    )

    ArmorClassType.NATURAL -> MonsterArmorClass.Natural(
        value = getInteger("value"),
        desc = getString("desc"),
    )

    ArmorClassType.SPELL  -> MonsterArmorClass.Spell(
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