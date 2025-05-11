package com.thejaxonhill.dnd5eapi.shared.persistence.converter

import org.springframework.core.convert.converter.Converter
import org.springframework.data.convert.ReadingConverter
import java.time.Instant
import java.util.*

@ReadingConverter
class DateReadingConverter : Converter<String, Date> {
    override fun convert(source: String): Date = Date.from(Instant.parse(source))
}