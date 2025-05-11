package com.thejaxonhill.dnd5eapi.monster.persistence

import com.thejaxonhill.dnd5eapi.monster.Monster
import com.thejaxonhill.dnd5eapi.monster.port.LoadMonsterPort
import com.thejaxonhill.dnd5eapi.shared.persistence.MongoAdapter
import org.springframework.stereotype.Component

@Component
class MonsterMongoAdapter(repository: MonsterRepository) :
    MongoAdapter<Monster>(repository, Monster::class),
    LoadMonsterPort