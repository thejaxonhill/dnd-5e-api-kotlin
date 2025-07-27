package com.thejaxonhill.dnd5eapi.subclass.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.adapter.MongoAdapter
import com.thejaxonhill.dnd5eapi.subclass.domain.model.Subclass
import com.thejaxonhill.dnd5eapi.subclass.domain.repository.SubclassRepository
import org.springframework.stereotype.Component

@Component
class SubclassMongoAdapter(repository: SubclassMongoRepository) :
    MongoAdapter<Subclass, SubclassDocument>(repository),
    SubclassRepository {
    override fun SubclassDocument.toDomain() = Subclass(
        characterClass = characterClass,
        desc = desc,
        index = index,
        name = name,
        spells = spells,
        subclassFlavor = subclassFlavor,
        subclassLevels = subclassLevels,
        url = url,
        updatedAt = updatedAt,
    )
}