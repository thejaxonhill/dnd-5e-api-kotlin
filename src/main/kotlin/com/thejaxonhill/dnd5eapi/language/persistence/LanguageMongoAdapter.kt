package com.thejaxonhill.dnd5eapi.language.persistence

import com.thejaxonhill.dnd5eapi.language.Language
import com.thejaxonhill.dnd5eapi.language.port.LoadLanguagePort
import com.thejaxonhill.dnd5eapi.shared.persistence.MongoAdapter
import org.springframework.stereotype.Component

@Component
class LanguageMongoAdapter(repository: LanguageRepository) :
    MongoAdapter<Language>(repository, Language::class),
    LoadLanguagePort