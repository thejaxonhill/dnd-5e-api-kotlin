package com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter

import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel
import org.springframework.data.domain.Page

fun <T : Any> Page<T>.toPagedModel() = PagedModel<T>(content, this.pageable.toPage())