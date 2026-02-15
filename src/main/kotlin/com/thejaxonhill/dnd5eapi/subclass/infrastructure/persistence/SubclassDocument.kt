package com.thejaxonhill.dnd5eapi.subclass.infrastructure.persistence

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import com.thejaxonhill.dnd5eapi.subclass.domain.model.SubclassSpell
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import java.time.LocalDateTime

@Document(collection = "subclasses")
class SubclassDocument(
    @Id
    var id: String? = null,
    @Field("class")
    var characterClass: ApiReference? = null,
    var desc: List<String>? = null,
    var index: String? = null,
    var name: String? = null,
    var spells: List<SubclassSpell>? = null,
    var subclassFlavor: String? = null,
    var subclassLevels: String? = null,
    var url: String? = null,
    var updatedAt: LocalDateTime? = null
)