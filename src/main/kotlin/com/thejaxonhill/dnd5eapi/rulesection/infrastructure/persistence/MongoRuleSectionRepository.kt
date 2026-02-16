package com.thejaxonhill.dnd5eapi.rulesection.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.rulesection.domain.RuleSection
import com.thejaxonhill.dnd5eapi.rulesection.domain.RuleSectionExample
import com.thejaxonhill.dnd5eapi.rulesection.domain.RuleSectionRepository
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPageable
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPagedModel
import org.springframework.data.domain.Example
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class MongoRuleSectionRepository(private val repository: RuleSectionMongoRepository) : RuleSectionRepository {
    override fun load(id: String): RuleSection? = repository.findByIdOrNull(id)?.toDomain()

    override fun loadByIndex(index: String): RuleSection? = repository.findByIndex(index)?.toDomain()

    override fun loadAll(page: Page, example: RuleSectionExample?): PagedModel<RuleSection> =
        repository.findAll(
            Example.of(example?.toRuleSectionDocument() ?: RuleSectionDocument()),
            page.toPageable()
        ).toPagedModel().map { it.toDomain() }

    override fun save(ruleSection: RuleSection) = repository.save(ruleSection.toDocument()).toDomain()
}

fun RuleSectionDocument.toDomain() = RuleSection(
    id = id,
    desc = desc!!,
    index = index!!,
    name = name!!,
    url = url!!,
    updatedAt = updatedAt!!,
)

fun RuleSection.toDocument() = RuleSectionDocument(
    id = id,
    desc = desc,
    index = index,
    name = name,
    url = url,
    updatedAt = updatedAt,
)

fun RuleSectionExample.toRuleSectionDocument(): RuleSectionDocument = RuleSectionDocument(
    name = name
)
