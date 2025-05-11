package com.thejaxonhill.dnd5eapi.alignment.persistence

import com.thejaxonhill.dnd5eapi.alignment.Alignment
import com.thejaxonhill.dnd5eapi.alignment.port.LoadAlignmentPort
import com.thejaxonhill.dnd5eapi.shared.persistence.MongoAdapter
import org.springframework.stereotype.Component

@Component
class AlignmentMongoAdapter(repository: AlignmentRepository) :
    MongoAdapter<Alignment>(repository, Alignment::class),
    LoadAlignmentPort