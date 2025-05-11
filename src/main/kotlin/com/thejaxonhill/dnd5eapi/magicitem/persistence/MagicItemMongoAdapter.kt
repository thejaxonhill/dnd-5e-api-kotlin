package com.thejaxonhill.dnd5eapi.magicitem.persistence

import com.thejaxonhill.dnd5eapi.magicitem.MagicItem
import com.thejaxonhill.dnd5eapi.magicitem.port.LoadMagicItemPort
import com.thejaxonhill.dnd5eapi.shared.persistence.MongoAdapter
import org.springframework.stereotype.Component

@Component
class MagicItemMongoAdapter(repository: MagicItemRepository) :
    MongoAdapter<MagicItem>(repository, MagicItem::class),
    LoadMagicItemPort