package com.thejaxonhill.dnd5eapi.trait.persistence

import com.thejaxonhill.dnd5eapi.shared.persistence.MongoAdapter
import com.thejaxonhill.dnd5eapi.trait.Trait
import com.thejaxonhill.dnd5eapi.trait.port.LoadTraitPort
import org.springframework.stereotype.Component

@Component
class TraitMongoAdapter(repository: TraitRepository) :
    MongoAdapter<Trait>(repository, Trait::class),
    LoadTraitPort