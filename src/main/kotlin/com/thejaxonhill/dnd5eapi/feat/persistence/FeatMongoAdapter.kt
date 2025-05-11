package com.thejaxonhill.dnd5eapi.feat.persistence

import com.thejaxonhill.dnd5eapi.feat.Feat
import com.thejaxonhill.dnd5eapi.feat.port.LoadFeatPort
import com.thejaxonhill.dnd5eapi.shared.persistence.MongoAdapter
import org.springframework.stereotype.Component

@Component
class FeatMongoAdapter(repository: FeatRepository) :
    MongoAdapter<Feat>(repository, Feat::class),
    LoadFeatPort