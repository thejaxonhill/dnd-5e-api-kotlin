package com.thejaxonhill.dnd5eapi.subclass.persistence

import com.thejaxonhill.dnd5eapi.shared.persistence.MongoAdapter
import com.thejaxonhill.dnd5eapi.subclass.Subclass
import com.thejaxonhill.dnd5eapi.subclass.port.LoadSubclassPort
import org.springframework.stereotype.Component

@Component
class SubclassMongoAdapter(repository: SubclassRepository) :
    MongoAdapter<Subclass>(repository, Subclass::class),
    LoadSubclassPort