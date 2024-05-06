package com.library.management.system.domain.service.impl

import com.library.management.system.domain.model.CatReservationStatusDO
import com.library.management.system.domain.repository.CatReservationStatusRepository
import com.library.management.system.domain.service.CatReservationStatusService
import org.springframework.stereotype.Service

@Service
class CatReservationStatusServiceImpl(val catReservationStatusRepository: CatReservationStatusRepository) : CatReservationStatusService {

    override fun create(catReservationStatusDO: CatReservationStatusDO): CatReservationStatusDO {
        return catReservationStatusRepository.create(catReservationStatusDO)
    }
}