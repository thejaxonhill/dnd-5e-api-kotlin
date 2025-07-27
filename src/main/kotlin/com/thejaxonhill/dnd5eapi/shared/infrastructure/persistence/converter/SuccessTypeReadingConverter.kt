package com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter

import com.thejaxonhill.dnd5eapi.shared.domain.model.SuccessType
import org.springframework.core.convert.converter.Converter
import org.springframework.data.convert.ReadingConverter

@ReadingConverter
class SuccessTypeReadingConverter : Converter<String, SuccessType> {
    override fun convert(source: String): SuccessType = SuccessType.fromString(source)
}