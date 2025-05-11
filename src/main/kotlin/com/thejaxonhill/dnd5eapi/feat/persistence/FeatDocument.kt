package com.thejaxonhill.dnd5eapi.feat.persistence

import com.thejaxonhill.dnd5eapi.feat.FeatPrerequisite
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document(collection = "feats")
class FeatDocument(
    @Id
    val id: String? = null,
    val index: String,
    val name: String,
    val prerequisites: List<FeatPrerequisite>,
    val desc: List<String>,
    val url: String,
    val updatedAt: Date
)