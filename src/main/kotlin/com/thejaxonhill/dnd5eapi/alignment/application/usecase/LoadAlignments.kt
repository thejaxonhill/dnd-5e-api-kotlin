package com.thejaxonhill.dnd5eapi.alignment.application.usecase

import com.thejaxonhill.dnd5eapi.alignment.domain.repository.AlignmentRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadAlignments(private val alignmentRepository: AlignmentRepository) {
    fun load() = alignmentRepository.loadAll()
}