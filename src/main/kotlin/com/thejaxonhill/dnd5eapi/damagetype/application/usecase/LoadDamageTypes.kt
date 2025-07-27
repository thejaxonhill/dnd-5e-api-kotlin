package com.thejaxonhill.dnd5eapi.damagetype.application.usecase

import com.thejaxonhill.dnd5eapi.damagetype.domain.repository.DamageTypeRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadDamageTypes(private val damageTypeRepository: DamageTypeRepository) {
    fun load() = damageTypeRepository.loadAll()
}