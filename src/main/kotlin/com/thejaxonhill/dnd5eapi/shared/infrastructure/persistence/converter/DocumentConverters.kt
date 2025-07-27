package com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter

import com.thejaxonhill.dnd5eapi.shared.domain.model.ApiReference
import org.bson.Document

fun Document.getDocument(key: String): Document? = get(key, Document::class.java)

fun Document.getDocumentList(key: String): List<Document>? = getList(key, Document::class.java)

fun Document.getApiReference(key: String) = getDocument(key)?.toApiReference()

fun Document.toApiReference() = ApiReference(
    index = getString("index"),
    name = getString("name"),
    url = getString("url")
)
