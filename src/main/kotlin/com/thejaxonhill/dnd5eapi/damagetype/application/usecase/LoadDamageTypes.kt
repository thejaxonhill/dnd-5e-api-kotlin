package com.thejaxonhill.dnd5eapi.damagetype.application.usecase

import com.thejaxonhill.dnd5eapi.damagetype.application.dto.toView
import com.thejaxonhill.dnd5eapi.damagetype.domain.DamageTypeExample
import com.thejaxonhill.dnd5eapi.damagetype.domain.DamageTypeRepository
import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase
import com.thejaxonhill.dnd5eapi.shared.domain.model.Page

@UseCase
class LoadDamageTypes(private val damageTypeRepository: DamageTypeRepository) {
    fun load(page: Page, example: DamageTypeExample?) =
        damageTypeRepository.loadAll(page, example).map { it.toView() }
}