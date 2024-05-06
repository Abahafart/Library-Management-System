package com.library.management.system.infra.controller

import com.library.management.system.domain.model.CatReservationStatusDO
import com.library.management.system.domain.service.CatReservationStatusService
import com.library.management.system.infra.controller.request.CatReservationStatusRequest
import com.library.management.system.infra.controller.response.CatReservationStatusResponse
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/catalogs")
class CatReservationController(val catReservationStatusService: CatReservationStatusService) {

    @PostMapping("/reservations")
    fun createReservation(@RequestBody catReservationStatusRequest: CatReservationStatusRequest): CatReservationStatusResponse {
        return buildReservationResponse(catReservationStatusService.create(buildReservationDO(catReservationStatusRequest)))
    }

    fun buildReservationDO(catReservationStatusRequest: CatReservationStatusRequest): CatReservationStatusDO {
        return CatReservationStatusDO(description = catReservationStatusRequest.description)
    }

    fun buildReservationResponse(catReservationStatusDO: CatReservationStatusDO): CatReservationStatusResponse {
        return CatReservationStatusResponse(id = catReservationStatusDO.id, description = catReservationStatusDO.description,
            createdAt = catReservationStatusDO.createdAt)
    }
}