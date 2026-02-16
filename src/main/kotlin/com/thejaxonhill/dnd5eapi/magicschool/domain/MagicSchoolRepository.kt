package com.thejaxonhill.dnd5eapi.magicschool.domain

import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel

interface MagicSchoolRepository {
    fun load(id: String): MagicSchool?
    fun loadByIndex(index: String): MagicSchool?
    fun loadAll(page: Page, example: MagicSchoolExample? = null): PagedModel<MagicSchool>
    fun save(magicSchool: MagicSchool): MagicSchool
}