package com.library.management.system.domain.repository

import com.library.management.system.domain.model.CatAccountStatusDO
import com.library.management.system.domain.model.CatBookStatusDO
import com.library.management.system.domain.model.CatReservationStatusDO

interface CatAccountStatusRepository {

    fun create(catAccountStatusDO: CatAccountStatusDO): CatAccountStatusDO
}

interface CatReservationStatusRepository {
    fun create(catReservationStatus: CatReservationStatusDO): CatReservationStatusDO
}

interface CatBookStatusRepository {
    fun create(catBookStatus: CatBookStatusDO): CatBookStatusDO
}