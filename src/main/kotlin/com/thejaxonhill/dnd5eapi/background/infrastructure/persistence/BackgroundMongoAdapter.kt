package com.thejaxonhill.dnd5eapi.background.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.background.domain.model.Background
import com.thejaxonhill.dnd5eapi.background.domain.repository.BackgroundRepository
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.adapter.MongoAdapter
import org.springframework.stereotype.Component

@Component
class BackgroundMongoAdapter(repository: BackgroundMongoRepository) :
    MongoAdapter<Background, BackgroundDocument>(repository),
    BackgroundRepository {
    override fun BackgroundDocument.toDomain() = Background(
        index = index,
        name = name,
        startingProficiencies = startingProficiencies,
        languageOptions = languageOptions,
        startingEquipment = startingEquipment,
        startingEquipmentOptions = startingEquipmentOptions,
        feature = feature,
        personalityTraits = personalityTraits,
        ideals = ideals,
        bonds = bonds,
        flaws = flaws,
        url = url,
        updatedAt = updatedAt,
    )
}