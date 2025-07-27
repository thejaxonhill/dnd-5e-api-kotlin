package com.thejaxonhill.dnd5eapi.feature.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.feature.application.usecase.LoadFeature
import com.thejaxonhill.dnd5eapi.feature.application.usecase.LoadFeatures
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/features")
class FeatureController(
    private val loadFeature: LoadFeature,
    private val loadFeatures: LoadFeatures
) {
    @GetMapping
    fun getFeatures() = ResponseEntity.ok(loadFeatures.load())

    @GetMapping("/{index}")
    fun getFeature(@PathVariable index: String) = ResponseEntity.ok(loadFeature.load(index))
}