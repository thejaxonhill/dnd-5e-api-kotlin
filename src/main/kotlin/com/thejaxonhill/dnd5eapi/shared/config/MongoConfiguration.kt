package com.thejaxonhill.dnd5eapi.shared.config

import com.thejaxonhill.dnd5eapi.monster.persistence.converter.MonsterArmorClassReadingConverter
import com.thejaxonhill.dnd5eapi.shared.persistence.converter.*
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.core.convert.MongoCustomConversions

@Configuration
class MongoConfiguration {
    @Bean
    fun customConversions() = MongoCustomConversions(
        listOf(
            ActionTypeReadingConverter(),
            AreaOfEffectTypeReader(),
            ChoiceReadingConverter(),
            DateReadingConverter(),
            MonsterArmorClassReadingConverter(),
            PrerequisiteReadingConverter(),
            SuccessTypeReadingConverter()
        )
    )
}