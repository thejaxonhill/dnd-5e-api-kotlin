package com.thejaxonhill.dnd5eapi.background.persistence

import com.thejaxonhill.dnd5eapi.background.Background
import com.thejaxonhill.dnd5eapi.background.port.LoadBackgroundPort
import com.thejaxonhill.dnd5eapi.shared.persistence.MongoAdapter
import org.springframework.stereotype.Component

@Component
class BackgroundMongoAdapter(repository: BackgroundRepository) :
    MongoAdapter<Background>(repository, Background::class),
    LoadBackgroundPort