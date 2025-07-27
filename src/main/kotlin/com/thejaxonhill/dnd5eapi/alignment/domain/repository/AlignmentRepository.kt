package com.thejaxonhill.dnd5eapi.alignment.domain.repository

import com.thejaxonhill.dnd5eapi.alignment.domain.model.Alignment
import com.thejaxonhill.dnd5eapi.shared.domain.repository.BaseRepository

interface AlignmentRepository : BaseRepository<Alignment, String>