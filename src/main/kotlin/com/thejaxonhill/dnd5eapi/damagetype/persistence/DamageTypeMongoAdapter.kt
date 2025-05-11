package com.thejaxonhill.dnd5eapi.damagetype.persistence

import com.thejaxonhill.dnd5eapi.damagetype.DamageType
import com.thejaxonhill.dnd5eapi.damagetype.port.LoadDamageTypePort
import com.thejaxonhill.dnd5eapi.shared.persistence.MongoAdapter
import org.springframework.stereotype.Component

@Component
class DamageTypeMongoAdapter(repository: DamageTypeRepository) :
    MongoAdapter<DamageType>(repository, DamageType::class),
    LoadDamageTypePort