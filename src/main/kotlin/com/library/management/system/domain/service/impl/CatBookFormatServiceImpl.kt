package com.library.management.system.domain.service.impl

import com.library.management.system.domain.model.CatBookFormatDO
import com.library.management.system.domain.repository.CatBookFormatRepository
import com.library.management.system.domain.service.CatBookFormatService
import org.springframework.stereotype.Service

@Service
class CatBookFormatServiceImpl(val repository: CatBookFormatRepository) : CatBookFormatService {

    override fun create(catBookFormatDO: CatBookFormatDO): CatBookFormatDO {
        return repository.create(catBookFormatDO)
    }
}