package com.thejaxonhill.dnd5eapi.condition.delivery

import com.thejaxonhill.dnd5eapi.condition.usecase.LoadCondition
import com.thejaxonhill.dnd5eapi.condition.usecase.LoadConditions
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/conditions")
class ConditionController(
    private val loadCondition: LoadCondition,
    private val loadConditions: LoadConditions
) {
    @GetMapping
    fun getConditions() = ResponseEntity.ok(loadConditions.load())

    @GetMapping("/{index}")
    fun getCondition(@PathVariable index: String) = ResponseEntity.ok(loadCondition.load(index))
}