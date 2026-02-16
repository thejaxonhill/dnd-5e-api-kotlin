package com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter

import com.thejaxonhill.dnd5eapi.shared.domain.model.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort

fun Page.toPageable(): Pageable = PageRequest.of(page ?: 0, size ?: 10, sort?.toSort() ?: Sort.unsorted())

fun Pageable.toPage(): Page = Page(
    pageNumber,
    pageSize,
    sort.map { "${it.property},${it.direction.name.lowercase()}" }.toList()
)

private fun List<String>.toSort() = map { it.trim() }
    .filter { it.isNotBlank() }
    .map { clause ->
        val (property, dir) = clause
            .split(',', limit = 2)
            .map { it.trim() }
            .let { parts -> parts[0] to parts.getOrNull(1) }

        val direction = dir?.let { Sort.Direction.fromString(dir) } ?: Sort.Direction.ASC
        Sort.Order(direction, property)
    }.let { orders -> if (orders.isEmpty()) Sort.unsorted() else Sort.by(orders) }