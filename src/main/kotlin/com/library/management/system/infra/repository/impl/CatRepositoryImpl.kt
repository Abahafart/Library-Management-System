package com.library.management.system.infra.repository.impl

import com.library.management.system.domain.model.CatAccountStatusDO
import com.library.management.system.domain.model.CatReservationStatusDO
import com.library.management.system.domain.repository.CatAccountStatusRepository
import com.library.management.system.domain.repository.CatReservationStatusRepository
import com.library.management.system.infra.repository.CatAccountStatusJPARepository
import com.library.management.system.infra.repository.CatReservationStatusJPARepository
import com.library.management.system.infra.repository.entities.CatAccountStatusEntity
import com.library.management.system.infra.repository.entities.CatReservationStatusEntity
import org.springframework.stereotype.Repository

@Repository
class CatAccountRepositoryImpl(val catAccountStatusJPARepository: CatAccountStatusJPARepository): CatAccountStatusRepository {

    override fun create(catAccountStatusDO: CatAccountStatusDO): CatAccountStatusDO {
        val entity = CatAccountStatusEntity(description = catAccountStatusDO.description)
        val accountStatusEntity = catAccountStatusJPARepository.save(entity)
        return buildDO(accountStatusEntity)
    }

    fun buildDO(catAccountStatusEntity: CatAccountStatusEntity): CatAccountStatusDO {
        return CatAccountStatusDO(id = catAccountStatusEntity.id, description = catAccountStatusEntity.description,
            createdAt = catAccountStatusEntity.createdAt)
    }

}

@Repository
class CatReservationRepositoryImpl(val catReservationStatusJPARepository: CatReservationStatusJPARepository):
    CatReservationStatusRepository {
    override fun create(catReservationStatus: CatReservationStatusDO): CatReservationStatusDO {
        val entity = CatReservationStatusEntity(description = catReservationStatus.description)
        val reservationEntity = catReservationStatusJPARepository.save(entity)
        return buildDO(reservationEntity)
    }

    fun buildDO(catReservationStatusEntity: CatReservationStatusEntity): CatReservationStatusDO {
        return CatReservationStatusDO(id = catReservationStatusEntity.id, description = catReservationStatusEntity.description,
            createdAt = catReservationStatusEntity.createdAt)
    }

}