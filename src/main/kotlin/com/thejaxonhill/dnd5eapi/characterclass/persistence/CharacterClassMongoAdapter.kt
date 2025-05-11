package com.thejaxonhill.dnd5eapi.characterclass.persistence

import com.thejaxonhill.dnd5eapi.characterclass.CharacterClass
import com.thejaxonhill.dnd5eapi.characterclass.port.LoadCharacterClassPort
import com.thejaxonhill.dnd5eapi.shared.persistence.MongoAdapter
import org.springframework.stereotype.Component

@Component
class CharacterClassMongoAdapter(repository: CharacterClassRepository) :
    MongoAdapter<CharacterClass>(repository, CharacterClass::class),
    LoadCharacterClassPort