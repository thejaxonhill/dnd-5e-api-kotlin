package com.thejaxonhill.dnd5eapi.proficiency.persistence

import com.thejaxonhill.dnd5eapi.proficiency.Proficiency
import com.thejaxonhill.dnd5eapi.proficiency.port.LoadProficiencyPort
import com.thejaxonhill.dnd5eapi.shared.persistence.MongoAdapter
import org.springframework.stereotype.Component

@Component
class ProficiencyMongoAdapter(repository: ProficiencyRepository) :
    MongoAdapter<Proficiency>(repository, Proficiency::class),
    LoadProficiencyPort