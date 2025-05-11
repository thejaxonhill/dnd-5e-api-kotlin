package com.thejaxonhill.dnd5eapi.rule.delivery

import com.thejaxonhill.dnd5eapi.rule.usecase.LoadRule
import com.thejaxonhill.dnd5eapi.rule.usecase.LoadRules
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/rules")
class RuleController(
    private val loadRule: LoadRule,
    private val loadRules: LoadRules
) {
    @GetMapping
    fun getRules() = ResponseEntity.ok(loadRules.load())

    @GetMapping("/{index}")
    fun getRule(@PathVariable index: String) = ResponseEntity.ok(loadRule.load(index))
}