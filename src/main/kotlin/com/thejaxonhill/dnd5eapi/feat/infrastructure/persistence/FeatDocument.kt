package com.thejaxonhill.dnd5eapi.feat.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.feat.domain.model.FeatPrerequisite
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "feats")
data class FeatDocument(
    @Id
    val id: String? = null,
    val index: String? = null,
    val name: String? = null,
    val prerequisites: List<FeatPrerequisite>? = null,
    val desc: List<String>? = null,
    val url: String? = null,
    val updatedAt: Date? = null
)