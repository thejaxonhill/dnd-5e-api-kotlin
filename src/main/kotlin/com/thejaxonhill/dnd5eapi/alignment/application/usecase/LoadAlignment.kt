package com.thejaxonhill.dnd5eapi.alignment.application.usecase

import com.thejaxonhill.dnd5eapi.alignment.domain.repository.AlignmentRepository
import com.thejaxonhill.dnd5eapi.shared.application.exception.NotFoundException
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadAlignment(private val alignmentRepository: AlignmentRepository) {
    fun load(index: String) = alignmentRepository.loadByIndex(index) ?: throw NotFoundException()
}