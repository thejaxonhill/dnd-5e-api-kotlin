package com.thejaxonhill.dnd5eapi.shared.persistence.converter

import com.thejaxonhill.dnd5eapi.shared.model.AreaOfEffectType
import org.springframework.core.convert.converter.Converter
import org.springframework.data.convert.ReadingConverter

@ReadingConverter
class AreaOfEffectTypeReader : Converter<String, AreaOfEffectType> {
    override fun convert(source: String): AreaOfEffectType = AreaOfEffectType.fromString(source)
}