package com.thejaxonhill.dnd5eapi.magicschool.application.usecase

import com.thejaxonhill.dnd5eapi.magicschool.application.dto.toView
import com.thejaxonhill.dnd5eapi.magicschool.domain.repository.MagicSchoolRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadMagicSchoolByIndex(private val magicSchoolRepository: MagicSchoolRepository) {
    fun load(index: String) = magicSchoolRepository.loadByIndex(index)?.toView() ?: throw NoSuchElementException()
}