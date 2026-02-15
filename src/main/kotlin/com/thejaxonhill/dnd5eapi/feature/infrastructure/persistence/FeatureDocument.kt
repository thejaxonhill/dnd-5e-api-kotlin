package com.thejaxonhill.dnd5eapi.feature.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.feature.domain.model.FeatureSpecific
import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.domain.model.Prerequisite
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import java.util.*

@Document(collection = "features")
data class FeatureDocument(
    @Id
    val id: String? = null,
    @Field("class")
    val characterClass: ApiReference? = null,
    val desc: List<String>? = null,
    val parent: ApiReference? = null,
    val index: String? = null,
    val level: Int? = null,
    val name: String? = null,
    val prerequisite: List<Prerequisite>? = null,
    val reference: String? = null,
    val subclass: ApiReference? = null,
    val featureSpecific: FeatureSpecific? = null,
    val url: String? = null,
    val updatedAt: Date? = null
)