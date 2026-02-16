package com.thejaxonhill.dnd5eapi.magicschool.application.usecase

import com.thejaxonhill.dnd5eapi.magicschool.application.dto.toView
import com.thejaxonhill.dnd5eapi.magicschool.domain.MagicSchoolExample
import com.thejaxonhill.dnd5eapi.magicschool.domain.MagicSchoolRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page

@UseCase
class LoadMagicSchools(private val magicSchoolRepository: MagicSchoolRepository) {
    fun load(page: Page, example: MagicSchoolExample?) =
        magicSchoolRepository.loadAll(page, example).map { it.toView() }
}