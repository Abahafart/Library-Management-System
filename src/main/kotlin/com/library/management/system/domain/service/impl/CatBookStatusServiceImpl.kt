package com.library.management.system.domain.service.impl

import com.library.management.system.domain.model.CatBookStatusDO
import com.library.management.system.domain.repository.CatBookStatusRepository
import com.library.management.system.domain.service.CatBookStatusService
import org.springframework.stereotype.Service

@Service
class CatBookStatusServiceImpl(val repository: CatBookStatusRepository): CatBookStatusService {
    override fun create(catBookStatusDO: CatBookStatusDO): CatBookStatusDO {
        return repository.create(catBookStatusDO)
    }
}