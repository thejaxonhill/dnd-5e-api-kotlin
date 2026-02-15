package com.thejaxonhill.dnd5eapi.abilityscore.application.port

interface AbilityScoreImageProvider {
    fun getImage(index: String): ByteArray
}