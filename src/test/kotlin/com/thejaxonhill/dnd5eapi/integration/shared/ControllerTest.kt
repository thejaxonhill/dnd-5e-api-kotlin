package com.thejaxonhill.dnd5eapi.integration.shared

import com.fasterxml.jackson.databind.node.JsonNodeType
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

private val om = jacksonObjectMapper()

@SpringBootTest
@AutoConfigureMockMvc
abstract class ControllerTest(val endpoint: String, val testIndex: String) {
    @Autowired
    lateinit var mvc: MockMvc

    @Test
    fun `when get endpoint then returns list with indexed items`() {
        val items = mvc.perform(get(endpoint))
            .andReturn().response.contentAsString.let { om.readTree(it) }

        assertEquals(items.nodeType, JsonNodeType.ARRAY)
        for (item in items) {
            val fieldNames = item.fieldNames().asSequence().toList()
            assertTrue(fieldNames.contains("index"))
            fieldNames.forEach { assertNotNull(item.get(it)) }
        }
    }

    @Test
    fun `when get item then returns single item with index`() {
        val item = mvc.perform(get("$endpoint/$testIndex"))
            .andReturn().response.contentAsString.let { om.readTree(it) }

        val fieldNames = item.fieldNames().asSequence().toList()
        assertTrue(fieldNames.contains("index"))
        fieldNames.forEach { assertNotNull(item.get(it)) }
    }

    @Test
    fun `when get missing item then returns 404`() {
        mvc.perform(get("$endpoint/not-found")).andExpect(status().isNotFound)
    }
}