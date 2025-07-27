package com.thejaxonhill.dnd5eapi.rule.domain.repository

import com.thejaxonhill.dnd5eapi.rule.domain.model.Rule
import com.thejaxonhill.dnd5eapi.shared.domain.repository.BaseRepository

interface LoadRulePort : BaseRepository<Rule, String>