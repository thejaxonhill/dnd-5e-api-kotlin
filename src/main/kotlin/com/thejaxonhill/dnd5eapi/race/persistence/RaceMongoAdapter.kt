package com.thejaxonhill.dnd5eapi.race.persistence

import com.thejaxonhill.dnd5eapi.race.Race
import com.thejaxonhill.dnd5eapi.race.port.LoadRacePort
import com.thejaxonhill.dnd5eapi.shared.persistence.MongoAdapter
import org.springframework.stereotype.Component

@Component
class RaceMongoAdapter(repository: RaceRepository) :
    MongoAdapter<Race>(repository, Race::class),
    LoadRacePort