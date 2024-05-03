package com.library.management.system.domain.service.impl

import com.library.management.system.domain.model.CatAccountStatusDO
import com.library.management.system.domain.repository.CatAccountStatusRepository
import com.library.management.system.domain.service.CatAccountStatusService
import org.springframework.stereotype.Service

@Service
class CatAccountStatusServiceImpl(val catAccountStatusRepository: CatAccountStatusRepository) : CatAccountStatusService {

    override fun create(catAccountStatusDO: CatAccountStatusDO): CatAccountStatusDO {
        return catAccountStatusRepository.create(catAccountStatusDO)
    }
}