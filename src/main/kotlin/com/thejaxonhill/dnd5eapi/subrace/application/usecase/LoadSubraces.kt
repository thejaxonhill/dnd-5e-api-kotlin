package com.thejaxonhill.dnd5eapi.subrace.application.usecase

import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.subrace.application.dto.toView
import com.thejaxonhill.dnd5eapi.subrace.domain.SubraceExample
import com.thejaxonhill.dnd5eapi.subrace.domain.SubraceRepository

@UseCase
class LoadSubraces(private val subraceRepository: SubraceRepository) {
    fun load(page: Page, example: SubraceExample?) =
        subraceRepository.loadAll(page, example).map { it.toView() }
}