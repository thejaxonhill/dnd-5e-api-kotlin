package com.thejaxonhill.dnd5eapi.trait.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.adapter.MongoAdapter
import com.thejaxonhill.dnd5eapi.trait.domain.model.Trait
import com.thejaxonhill.dnd5eapi.trait.domain.repository.TraitRepository
import org.springframework.stereotype.Component

@Component
class TraitMongoAdapter(repository: TraitMongoRepository) :
    MongoAdapter<Trait, TraitDocument>(repository),
    TraitRepository {
    override fun TraitDocument.toDomain() = Trait(
        desc = desc,
        index = index,
        name = name,
        proficiencies = proficiencies,
        proficiencyChoices = proficiencyChoices,
        languageOptions = languageOptions,
        races = races,
        subraces = subraces,
        parent = parent,
        traitSpecific = traitSpecific,
        url = url,
        updatedAt = updatedAt,
    )
}