package com.thejaxonhill.dnd5eapi.shared.persistence.converter

import com.thejaxonhill.dnd5eapi.shared.converter.getApiReference
import com.thejaxonhill.dnd5eapi.shared.model.*
import org.bson.Document
import org.springframework.core.convert.converter.Converter
import org.springframework.data.convert.ReadingConverter

fun Document.toPrerequisite() = when (getString("type")) {
    "feature" -> FeaturePrerequisite(getString("feature"))
    "level" -> LevelPrerequisite(getInteger("level"))
    "proficiency" -> ProficiencyPrerequisite(getApiReference("proficiency"))
    "spell" -> SpellPrerequisite(getString("spell"))
    else -> null
}

@ReadingConverter
class PrerequisiteReadingConverter : Converter<Document, Prerequisite> {
    override fun convert(source: Document) = source.toPrerequisite()
}