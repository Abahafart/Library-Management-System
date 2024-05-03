package com.library.management.system.domain.repository

import com.library.management.system.domain.model.CatAccountStatusDO

interface CatAccountStatusRepository {

    fun create(catAccountStatusDO: CatAccountStatusDO): CatAccountStatusDO
}