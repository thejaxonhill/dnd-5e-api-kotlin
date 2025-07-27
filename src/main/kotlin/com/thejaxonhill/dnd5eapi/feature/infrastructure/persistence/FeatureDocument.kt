package com.thejaxonhill.dnd5eapi.feature.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.feature.domain.model.FeatureSpecific
import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.domain.model.Prerequisite
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import java.util.*

@Document(collection = "features")
class FeatureDocument(
    @Id
    val id: String?,
    @Field("class")
    val characterClass: ApiReference,
    val desc: List<String>,
    val parent: ApiReference? = null,
    val index: String,
    val level: Int,
    val name: String,
    val prerequisite: List<Prerequisite>?,
    val reference: String?,
    val subclass: ApiReference?,
    val featureSpecific: FeatureSpecific?,
    val url: String,
    val updatedAt: Date
)