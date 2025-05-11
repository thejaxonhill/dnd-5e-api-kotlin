package com.thejaxonhill.dnd5eapi.subrace.persistence

import com.thejaxonhill.dnd5eapi.shared.persistence.MongoAdapter
import com.thejaxonhill.dnd5eapi.subrace.Subrace
import com.thejaxonhill.dnd5eapi.subrace.port.LoadSubracePort
import org.springframework.stereotype.Component

@Component
class SubraceMongoAdapter(repository: SubraceRepository) :
    MongoAdapter<Subrace>(repository, Subrace::class),
    LoadSubracePort