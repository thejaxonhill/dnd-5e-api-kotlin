package com.thejaxonhill.dnd5eapi.monster.domain.repository

import com.thejaxonhill.dnd5eapi.monster.domain.model.Monster
import com.thejaxonhill.dnd5eapi.shared.domain.repository.BaseRepository

interface MonsterRepository : BaseRepository<Monster, String>