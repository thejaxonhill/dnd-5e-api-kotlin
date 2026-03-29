package com.thejaxonhill.dnd5eapi.feat.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.feat.domain.FeatPrerequisite
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document(collection = "2014-feats")
class FeatDocument(
    @Id
    var id: String? = null,
    var index: String? = null,
    var name: String? = null,
    var prerequisites: List<FeatPrerequisite>? = null,
    var desc: List<String>? = null,
    var url: String? = null,
    var updatedAt: LocalDateTime? = null
)