package com.thejaxonhill.dnd5eapi.damagetype.application.usecase

import com.thejaxonhill.dnd5eapi.damagetype.domain.repository.DamageTypeRepository
import com.thejaxonhill.dnd5eapi.shared.application.exception.NotFoundException
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadDamageType(private val damageTypeRepository: DamageTypeRepository) {
    fun load(index: String) = damageTypeRepository.loadByIndex(index) ?: throw NotFoundException()
}