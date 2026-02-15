package com.thejaxonhill.dnd5eapi.alignment.application.usecase

import com.thejaxonhill.dnd5eapi.alignment.application.dto.toView
import com.thejaxonhill.dnd5eapi.alignment.domain.model.AlignmentExample
import com.thejaxonhill.dnd5eapi.alignment.domain.repository.AlignmentRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page

@UseCase
class LoadAlignments(private val alignmentRepository: AlignmentRepository) {
    fun load(page: Page, example: AlignmentExample?) =
        alignmentRepository.loadAll(page, example).map { it.toView() }
}