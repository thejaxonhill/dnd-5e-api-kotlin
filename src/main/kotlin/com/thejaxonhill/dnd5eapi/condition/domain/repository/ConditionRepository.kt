package com.thejaxonhill.dnd5eapi.condition.domain.repository

import com.thejaxonhill.dnd5eapi.condition.domain.model.Condition
import com.thejaxonhill.dnd5eapi.shared.domain.repository.BaseRepository

interface ConditionRepository : BaseRepository<Condition, String>