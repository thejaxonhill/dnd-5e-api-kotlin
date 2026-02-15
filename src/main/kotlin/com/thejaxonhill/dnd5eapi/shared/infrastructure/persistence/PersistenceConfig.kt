package com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.monster.infrastructure.persistence.MonsterArmorClassReadingConverter
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.ActionTypeReadingConverter
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.AreaOfEffectTypeReader
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.ChoiceReadingConverter
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.PrerequisiteReadingConverter
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.SuccessTypeReadingConverter
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.mapping.model.SnakeCaseFieldNamingStrategy
import org.springframework.data.mongodb.core.convert.MongoCustomConversions
import org.springframework.data.mongodb.core.mapping.MongoMappingContext

@Configuration
class PersistenceConfig {
    @Bean
    fun mongoMappingContext(): MongoMappingContext =
        MongoMappingContext().apply { setFieldNamingStrategy(SnakeCaseFieldNamingStrategy()) }

    @Bean
    fun customConversions() = MongoCustomConversions(
        listOf(
            ActionTypeReadingConverter(),
            AreaOfEffectTypeReader(),
            ChoiceReadingConverter(),
            MonsterArmorClassReadingConverter(),
            PrerequisiteReadingConverter(),
            SuccessTypeReadingConverter()
        )
    )
}