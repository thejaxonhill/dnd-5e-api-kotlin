package com.thejaxonhill.dnd5eapi.weaponproperty.application.dto

import com.thejaxonhill.dnd5eapi.weaponproperty.domain.model.WeaponProperty

data class WeaponPropertyView(
    val desc: List<String>,
    val index: String,
    val name: String,
    val url: String,
)

fun WeaponProperty.toView() = WeaponPropertyView(
    desc = desc,
    index = index,
    name = name,
    url = url,
)
