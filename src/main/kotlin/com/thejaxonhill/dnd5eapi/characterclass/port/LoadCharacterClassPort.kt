package com.thejaxonhill.dnd5eapi.characterclass.port

import com.thejaxonhill.dnd5eapi.characterclass.CharacterClass

interface LoadCharacterClassPort {
    fun loadByIndex(index: String): CharacterClass?
    fun loadAll(): List<CharacterClass>
}