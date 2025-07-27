package com.thejaxonhill.dnd5eapi.equipment.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.equipment.application.usecase.LoadAllEquipment
import com.thejaxonhill.dnd5eapi.equipment.application.usecase.LoadEquipment
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/equipment")
class EquipmentController(
    private val loadEquipment: LoadEquipment,
    private val loadAllEquipment: LoadAllEquipment
) {
    @GetMapping
    fun getAllEquipment() = ResponseEntity.ok(loadAllEquipment.load())

    @GetMapping("/{index}")
    fun getEquipment(@PathVariable index: String) = ResponseEntity.ok(loadEquipment.load(index))
}