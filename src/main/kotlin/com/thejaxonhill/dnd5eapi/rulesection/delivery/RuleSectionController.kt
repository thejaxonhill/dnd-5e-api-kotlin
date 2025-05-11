package com.thejaxonhill.dnd5eapi.rulesection.delivery

import com.thejaxonhill.dnd5eapi.rulesection.usecase.LoadRuleSection
import com.thejaxonhill.dnd5eapi.rulesection.usecase.LoadRuleSections
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/rule-sections")
class RuleSectionController(
    private val loadRuleSection: LoadRuleSection,
    private val loadRuleSections: LoadRuleSections
) {
    @GetMapping
    fun getRuleSections() = ResponseEntity.ok(loadRuleSections.load())

    @GetMapping("/{index}")
    fun getRuleSection(@PathVariable index: String) = ResponseEntity.ok(loadRuleSection.load(index))
}