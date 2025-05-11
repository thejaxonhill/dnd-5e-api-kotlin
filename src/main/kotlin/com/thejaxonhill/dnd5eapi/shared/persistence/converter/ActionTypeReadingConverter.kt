package com.thejaxonhill.dnd5eapi.shared.persistence.converter

import com.thejaxonhill.dnd5eapi.shared.model.ActionType
import org.springframework.core.convert.converter.Converter
import org.springframework.data.convert.ReadingConverter

@ReadingConverter
class ActionTypeReadingConverter : Converter<String, ActionType> {
    override fun convert(source: String): ActionType? = ActionType.fromString(source)
}