package com.library.management.system.domain.service

import com.library.management.system.domain.model.CatAccountStatusDO
import com.library.management.system.domain.model.CatBookStatusDO
import com.library.management.system.domain.model.CatReservationStatusDO

interface CatAccountStatusService {

    fun create(catAccountStatusDO: CatAccountStatusDO): CatAccountStatusDO
}

interface CatReservationStatusService {

    fun create(catReservationStatusDO: CatReservationStatusDO): CatReservationStatusDO
}

interface CatBookStatusService {

    fun create(catBookStatusDO: CatBookStatusDO): CatBookStatusDO
}