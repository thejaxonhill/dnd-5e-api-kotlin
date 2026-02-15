package com.thejaxonhill.dnd5eapi.subclass.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.subclass.domain.model.SubclassSpell
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import java.util.*

@Document(collection = "subclasses")
data class SubclassDocument(
    @Id
    val id: String? = null,
    @Field("class")
    val characterClass: ApiReference? = null,
    val desc: List<String>? = null,
    val index: String? = null,
    val name: String? = null,
    val spells: List<SubclassSpell>? = null,
    val subclassFlavor: String? = null,
    val subclassLevels: String? = null,
    val url: String? = null,
    val updatedAt: Date? = null
)