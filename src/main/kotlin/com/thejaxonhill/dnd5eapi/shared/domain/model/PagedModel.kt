package com.thejaxonhill.dnd5eapi.shared.domain.model

data class PagedModel<out T : Any> (
    val content: List<T>,
    val page: Page,
) {
    fun <R : Any> map(transform: (T) -> R): PagedModel<R> = PagedModel(content.map(transform), page)
}