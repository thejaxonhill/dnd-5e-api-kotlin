package com.thejaxonhill.dnd5eapi.feat.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.feat.application.usecase.LoadFeat
import com.thejaxonhill.dnd5eapi.feat.application.usecase.LoadFeats
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/feats")
class FeatController(
    private val loadFeat: LoadFeat,
    private val loadFeats: LoadFeats
) {
    @GetMapping
    fun getFeats() = ResponseEntity.ok(loadFeats.load())

    @GetMapping("/{index}")
    fun getFeat(@PathVariable index: String) = ResponseEntity.ok(loadFeat.load(index))
}