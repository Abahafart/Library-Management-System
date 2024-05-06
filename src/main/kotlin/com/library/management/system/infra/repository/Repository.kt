package com.library.management.system.infra.repository

import com.library.management.system.infra.repository.entities.CatAccountStatusEntity
import com.library.management.system.infra.repository.entities.CatBookStatusEntity
import com.library.management.system.infra.repository.entities.CatReservationStatusEntity
import org.springframework.data.jpa.repository.JpaRepository

interface CatAccountStatusJPARepository : JpaRepository<CatAccountStatusEntity, Long>{}
interface CatReservationStatusJPARepository : JpaRepository<CatReservationStatusEntity, Long>{}
interface CatBookStatusJPARepository : JpaRepository<CatBookStatusEntity, Long>{}