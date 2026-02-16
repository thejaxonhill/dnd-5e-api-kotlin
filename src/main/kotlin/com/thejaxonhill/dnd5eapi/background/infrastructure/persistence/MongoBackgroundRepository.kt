package com.thejaxonhill.dnd5eapi.background.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.background.domain.Background
import com.thejaxonhill.dnd5eapi.background.domain.BackgroundExample
import com.thejaxonhill.dnd5eapi.background.domain.BackgroundRepository
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPageable
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPagedModel
import org.springframework.data.domain.Example
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class MongoBackgroundRepository(private val repository: BackgroundMongoRepository) : BackgroundRepository {
    override fun load(id: String): Background? = repository.findByIdOrNull(id)?.toDomain()

    override fun loadByIndex(index: String): Background? = repository.findByIndex(index)?.toDomain()

    override fun loadAll(page: Page, example: BackgroundExample?): PagedModel<Background> =
        repository.findAll(
            Example.of(example?.toBackgroundDocument() ?: BackgroundDocument()),
            page.toPageable()
        ).toPagedModel().map { it.toDomain() }

    override fun save(background: Background) = repository.save(background.toDocument()).toDomain()
}

fun BackgroundDocument.toDomain() = Background(
    id = id,
    index = index!!,
    name = name!!,
    startingProficiencies = startingProficiencies!!,
    languageOptions = languageOptions!!,
    startingEquipment = startingEquipment!!,
    startingEquipmentOptions = startingEquipmentOptions!!,
    feature = feature!!,
    personalityTraits = personalityTraits!!,
    ideals = ideals!!,
    bonds = bonds!!,
    flaws = flaws!!,
    url = url!!,
    updatedAt = updatedAt!!,
)

fun Background.toDocument() = BackgroundDocument(
    id = id,
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

fun BackgroundExample.toBackgroundDocument(): BackgroundDocument = BackgroundDocument(
    name = name
)
