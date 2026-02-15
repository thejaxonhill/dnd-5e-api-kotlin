package com.thejaxonhill.dnd5eapi.rule.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.rule.domain.model.Rule
import com.thejaxonhill.dnd5eapi.rule.domain.model.RuleExample
import com.thejaxonhill.dnd5eapi.rule.domain.repository.RuleRepository
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPageable
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPagedModel
import org.springframework.data.domain.Example
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class MongoRuleRepository(private val repository: RuleMongoRepository) : RuleRepository {
    override fun load(id: String): Rule? = repository.findByIdOrNull(id)?.toDomain()

    override fun loadByIndex(index: String): Rule? = repository.findByIndex(index)?.toDomain()

    override fun loadAll(page: Page, example: RuleExample?): PagedModel<Rule> =
        repository.findAll(
            Example.of(example?.toRuleDocument() ?: RuleDocument()),
            page.toPageable()
        ).toPagedModel().map { it.toDomain() }

    override fun save(rule: Rule) = repository.save(rule.toDocument()).toDomain()
}

fun RuleDocument.toDomain() = Rule(
    id = id,
    desc = desc!!,
    index = index!!,
    name = name!!,
    subsections = subsections!!,
    url = url!!,
    updatedAt = updatedAt!!,
)

fun Rule.toDocument() = RuleDocument(
    id = id,
    desc = desc,
    index = index,
    name = name,
    subsections = subsections,
    url = url,
    updatedAt = updatedAt,
)

fun RuleExample.toRuleDocument(): RuleDocument = RuleDocument(
    name = name
)
