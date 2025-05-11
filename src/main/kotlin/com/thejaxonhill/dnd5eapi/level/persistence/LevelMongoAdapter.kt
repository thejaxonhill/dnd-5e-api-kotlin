package com.thejaxonhill.dnd5eapi.level.persistence

import com.thejaxonhill.dnd5eapi.level.Level
import com.thejaxonhill.dnd5eapi.level.port.LoadLevelPort
import com.thejaxonhill.dnd5eapi.shared.persistence.MongoAdapter
import org.springframework.stereotype.Component

@Component
class LevelMongoAdapter(repository: LevelRepository) :
    MongoAdapter<Level>(repository, Level::class),
    LoadLevelPort