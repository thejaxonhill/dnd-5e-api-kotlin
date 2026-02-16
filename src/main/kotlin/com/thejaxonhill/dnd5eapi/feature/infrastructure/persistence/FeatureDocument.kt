package com.thejaxonhill.dnd5eapi.feature.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.feature.domain.FeatureSpecific
import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.shared.domain.model.Prerequisite
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import java.time.LocalDateTime

@Document(collection = "features")
class FeatureDocument(
    @Id
    var id: String? = null,
    @Field("class")
    var characterClass: ApiReference? = null,
    var desc: List<String>? = null,
    var parent: ApiReference? = null,
    var index: String? = null,
    var level: Int? = null,
    var name: String? = null,
    var prerequisite: List<Prerequisite>? = null,
    var reference: String? = null,
    var subclass: ApiReference? = null,
    var featureSpecific: FeatureSpecific? = null,
    var url: String? = null,
    var updatedAt: LocalDateTime? = null
)