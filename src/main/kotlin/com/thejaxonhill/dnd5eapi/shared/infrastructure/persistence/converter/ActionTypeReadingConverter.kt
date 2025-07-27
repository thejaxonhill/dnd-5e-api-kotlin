package com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter

import com.thejaxonhill.dnd5eapi.shared.domain.model.ActionType
import org.springframework.core.convert.converter.Converter
import org.springframework.data.convert.ReadingConverter

@ReadingConverter
class ActionTypeReadingConverter : Converter<String, ActionType> {
    override fun convert(source: String): ActionType? = ActionType.fromString(source)
}