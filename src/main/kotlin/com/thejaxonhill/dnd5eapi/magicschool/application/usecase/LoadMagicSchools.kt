package com.thejaxonhill.dnd5eapi.magicschool.application.usecase

import com.thejaxonhill.dnd5eapi.magicschool.domain.repository.MagicSchoolRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadMagicSchools(private val magicSchoolRepository: MagicSchoolRepository) {
    fun load() = magicSchoolRepository.loadAll()
}