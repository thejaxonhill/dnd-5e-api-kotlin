package com.thejaxonhill.dnd5eapi.feature.infrastructure.delivery

import com.thejaxonhill.dnd5eapi.feature.application.dto.FeatureView
import com.thejaxonhill.dnd5eapi.feature.application.usecase.LoadFeatureByIndex
import com.thejaxonhill.dnd5eapi.feature.application.usecase.LoadFeatures
import com.thejaxonhill.dnd5eapi.feature.domain.model.FeatureExample
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

@Tag(name = "Features")
@RestController
@RequestMapping("/api/features")
class FeatureController(
    private val loadFeatureByIndex: LoadFeatureByIndex,
    private val loadFeatures: LoadFeatures
) {
    @Operation(summary = "Get a paginated list of features")
    @GetMapping
    fun getFeatures(
        @ParameterObject pageable: Pageable,
        @ParameterObject example: FeatureExample?
    ): ResponseEntity<PagedModel<FeatureView>> =
        ResponseEntity.ok(loadFeatures.load(pageable.toPage(), example))

    @Operation(summary = "Get a feature by index")
    @GetMapping("/{index}")
    fun getFeature(@PathVariable index: String): ResponseEntity<FeatureView> =
        ResponseEntity.ok(loadFeatureByIndex.load(index))
}