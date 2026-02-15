package com.thejaxonhill.dnd5eapi.monster.application.usecase

import com.thejaxonhill.dnd5eapi.monster.domain.repository.MonsterRepository

import com.thejaxonhill.dnd5eapi.shared.application.stereotype.UseCase

@UseCase
class LoadMonster(private val monsterRepository: MonsterRepository) {
    fun load(index: String) = monsterRepository.loadByIndex(index) ?: throw NoSuchElementException()
}