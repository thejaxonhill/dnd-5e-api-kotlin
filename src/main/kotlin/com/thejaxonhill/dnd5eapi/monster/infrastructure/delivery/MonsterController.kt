package com.thejaxonhill.dnd5eapi.monster.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.monster.application.dto.MonsterView
import com.thejaxonhill.dnd5eapi.monster.application.usecase.LoadMonsterByIndex
import com.thejaxonhill.dnd5eapi.monster.application.usecase.LoadMonsters
import com.thejaxonhill.dnd5eapi.monster.domain.model.MonsterExample
import com.thejaxonhill.dnd5eapi.shared.domain.model.PagedModel
import com.thejaxonhill.dnd5eapi.shared.infrastructure.persistence.converter.toPage
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springdoc.core.annotations.ParameterObject
import org.springframework.data.domain.Pageable
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Tag(name = "Monsters")
@RestController
@RequestMapping("/api/monsters")
class MonsterController(
    private val loadMonsterByIndex: LoadMonsterByIndex,
    private val loadMonsters: LoadMonsters
) {
    @Operation(summary = "Get a paginated list of monsters")
    @GetMapping
    fun getMonsters(
        @ParameterObject pageable: Pageable,
        @ParameterObject example: MonsterExample?
    ): ResponseEntity<PagedModel<MonsterView>> =
        ResponseEntity.ok(loadMonsters.load(pageable.toPage(), example))

    @Operation(summary = "Get a monster by index")
    @GetMapping("/{index}")
    fun getMonster(@PathVariable index: String): ResponseEntity<MonsterView> =
        ResponseEntity.ok(loadMonsterByIndex.load(index))
}