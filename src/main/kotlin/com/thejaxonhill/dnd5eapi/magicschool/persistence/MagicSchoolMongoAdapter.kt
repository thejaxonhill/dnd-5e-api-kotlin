package com.thejaxonhill.dnd5eapi.magicschool.persistence

import com.thejaxonhill.dnd5eapi.magicschool.MagicSchool
import com.thejaxonhill.dnd5eapi.magicschool.port.LoadMagicSchoolPort
import com.thejaxonhill.dnd5eapi.shared.persistence.MongoAdapter
import org.springframework.stereotype.Component

@Component
class MagicSchoolMongoAdapter(repository: MagicSchoolRepository) :
    MongoAdapter<MagicSchool>(repository, MagicSchool::class),
    LoadMagicSchoolPort