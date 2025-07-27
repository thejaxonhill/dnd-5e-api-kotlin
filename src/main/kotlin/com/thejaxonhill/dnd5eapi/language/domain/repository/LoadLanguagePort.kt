package com.thejaxonhill.dnd5eapi.language.domain.repository

import com.thejaxonhill.dnd5eapi.language.domain.model.Language
import com.thejaxonhill.dnd5eapi.shared.domain.repository.BaseRepository

interface LoadLanguagePort : BaseRepository<Language, String>