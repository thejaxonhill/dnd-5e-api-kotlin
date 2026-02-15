package com.thejaxonhill.dnd5eapi.damagetype.application.usecase

import com.thejaxonhill.dnd5eapi.damagetype.application.dto.toView
import com.thejaxonhill.dnd5eapi.damagetype.domain.repository.DamageTypeRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadDamageTypeByIndex(private val damageTypeRepository: DamageTypeRepository) {
    fun load(index: String) = damageTypeRepository.loadByIndex(index)?.toView() ?: throw NoSuchElementException()
}