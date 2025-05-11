package com.thejaxonhill.dnd5eapi.spell.persistence

import com.thejaxonhill.dnd5eapi.shared.persistence.MongoAdapter
import com.thejaxonhill.dnd5eapi.spell.Spell
import com.thejaxonhill.dnd5eapi.spell.port.LoadSpellPort
import org.springframework.stereotype.Component

@Component
class SpellMongoAdapter(repository: SpellRepository) :
    MongoAdapter<Spell>(repository, Spell::class),
    LoadSpellPort