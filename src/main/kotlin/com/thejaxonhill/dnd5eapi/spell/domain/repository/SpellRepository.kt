package com.thejaxonhill.dnd5eapi.spell.domain.repository

import com.thejaxonhill.dnd5eapi.shared.domain.repository.BaseRepository
import com.thejaxonhill.dnd5eapi.spell.domain.model.Spell

interface SpellRepository : BaseRepository<Spell, String>