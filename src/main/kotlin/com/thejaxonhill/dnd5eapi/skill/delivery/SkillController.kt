package com.thejaxonhill.dnd5eapi.skill.delivery

import com.thejaxonhill.dnd5eapi.skill.usecase.LoadSkill
import com.thejaxonhill.dnd5eapi.skill.usecase.LoadSkills
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/skills")
class SkillController(
    private val loadSkill: LoadSkill,
    private val loadSkills: LoadSkills
) {
    @GetMapping
    fun getSkills() = ResponseEntity.ok(loadSkills.load())

    @GetMapping("/{index}")
    fun getSkill(@PathVariable index: String) = ResponseEntity.ok(loadSkill.load(index))
}