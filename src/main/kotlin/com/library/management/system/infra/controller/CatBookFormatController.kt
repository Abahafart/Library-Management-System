package com.library.management.system.infra.controller

import com.library.management.system.domain.model.CatBookFormatDO
import com.library.management.system.domain.service.CatBookFormatService
import com.library.management.system.infra.controller.request.CatBookFormatRequest
import com.library.management.system.infra.controller.response.CatBookFormatResponse
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/catalogs/books/formats")
class CatBookFormatController(val service: CatBookFormatService) {

    @PostMapping
    fun create(@RequestBody request: CatBookFormatRequest): CatBookFormatResponse {
        val bookFormatDO = CatBookFormatDO(description = request.description)
        return buildResponse(service.create(bookFormatDO))
    }

    fun buildResponse(catBookFormat: CatBookFormatDO): CatBookFormatResponse {
        return CatBookFormatResponse(id = catBookFormat.id, description = catBookFormat.description,
            createdAt = catBookFormat.createdAt)
    }
}