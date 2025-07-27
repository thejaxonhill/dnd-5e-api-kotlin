package com.thejaxonhill.dnd5eapi.subclass.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.subclass.domain.model.SubclassSpell
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import java.util.*

@Document(collection = "subclasses")
class SubclassDocument(
    @Id
    val id: String? = null,
    @Field("class")
    val characterClass: ApiReference,
    val desc: List<String>,
    val index: String,
    val name: String,
    val spells: List<SubclassSpell>? = null,
    val subclassFlavor: String,
    val subclassLevels: String,
    val url: String,
    val updatedAt: Date,
)