package com.library.management.system.infra.controller

import com.library.management.system.domain.model.CatBookStatusDO
import com.library.management.system.domain.service.CatBookStatusService
import com.library.management.system.infra.controller.request.CatBookStatusRequest
import com.library.management.system.infra.controller.response.CatBookStatusResponse
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/catalogs")
class CatBookController(val service: CatBookStatusService) {

    @PostMapping("/books")
    fun create(@RequestBody request: CatBookStatusRequest): CatBookStatusResponse {
        val bookDO = CatBookStatusDO(description = request.description)
        return buildBookResponse(service.create(bookDO))
    }

    fun buildBookResponse(statusDO: CatBookStatusDO): CatBookStatusResponse {
        return CatBookStatusResponse(id = statusDO.id, description = statusDO.description, createdAt = statusDO.createdAt)
    }
}