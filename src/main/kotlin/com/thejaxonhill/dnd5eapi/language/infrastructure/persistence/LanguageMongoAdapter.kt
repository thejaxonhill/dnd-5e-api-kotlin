package com.thejaxonhill.dnd5eapi.language.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.language.domain.model.Language
import com.thejaxonhill.dnd5eapi.language.domain.repository.LoadLanguagePort
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.adapter.MongoAdapter
import org.springframework.stereotype.Component

@Component
class LanguageMongoAdapter(repository: LanguageMongoRepository) :
    MongoAdapter<Language, LanguageDocument>(repository),
    LoadLanguagePort {
    override fun LanguageDocument.toDomain() = Language(
        desc = desc,
        index = index,
        name = name,
        script = script,
        type = type,
        typicalSpeakers = typicalSpeakers,
        url = url,
        updatedAt = updatedAt,
    )
}