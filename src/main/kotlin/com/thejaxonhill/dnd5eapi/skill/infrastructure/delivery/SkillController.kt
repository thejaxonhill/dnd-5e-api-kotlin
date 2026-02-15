package com.thejaxonhill.dnd5eapi.skill.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPage
import com.thejaxonhill.dnd5eapi.skill.application.dto.SkillView
import com.thejaxonhill.dnd5eapi.skill.application.usecase.LoadSkillByIndex
import com.thejaxonhill.dnd5eapi.skill.application.usecase.LoadSkills
import com.thejaxonhill.dnd5eapi.skill.domain.model.SkillExample
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springdoc.core.annotations.ParameterObject
import org.springframework.data.domain.Pageable
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Tag(name = "Skills")
@RestController
@RequestMapping("/api/skills")
class SkillController(
    private val loadSkillByIndex: LoadSkillByIndex,
    private val loadSkills: LoadSkills
) {
    @Operation(summary = "Get a paginated list of skills")
    @GetMapping
    fun getSkills(
        @ParameterObject pageable: Pageable,
        @ParameterObject example: SkillExample?
    ): ResponseEntity<PagedModel<SkillView>> =
        ResponseEntity.ok(loadSkills.load(pageable.toPage(), example))

    @Operation(summary = "Get a skill by index")
    @GetMapping("/{index}")
    fun getSkill(@PathVariable index: String): ResponseEntity<SkillView> =
        ResponseEntity.ok(loadSkillByIndex.load(index))
}