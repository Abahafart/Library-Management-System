package com.library.management.system.infra.controller

import com.library.management.system.domain.model.CatAccountStatusDO
import com.library.management.system.domain.service.CatAccountStatusService
import com.library.management.system.infra.controller.request.CatAccountStatusRequest
import com.library.management.system.infra.controller.response.CatAccountStatusResponse
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/catalogs")
class CatController(val catAccountStatusService: CatAccountStatusService) {

    @PostMapping("/accounts")
    fun createAccountStatus(@RequestBody catAccountStatusRequest: CatAccountStatusRequest): CatAccountStatusResponse {
        return buildResponse(catAccountStatusService.create(buildDO(catAccountStatusRequest)));
    }

    fun buildDO(catAccountStatusRequest: CatAccountStatusRequest): CatAccountStatusDO {
        return CatAccountStatusDO(description = catAccountStatusRequest.description)
    }

    fun buildResponse(catAccountStatusDO: CatAccountStatusDO): CatAccountStatusResponse {
        return CatAccountStatusResponse(id = catAccountStatusDO.id, description = catAccountStatusDO.description,
            createdAt = catAccountStatusDO.createdAt)
    }

}