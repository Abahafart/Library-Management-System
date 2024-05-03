package com.library.management.system.domain.service

import com.library.management.system.domain.model.CatAccountStatusDO

interface CatAccountStatusService {

    fun create(catAccountStatusDO: CatAccountStatusDO): CatAccountStatusDO
}