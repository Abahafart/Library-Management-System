package com.library.management.system.infra.repository.impl

import com.library.management.system.domain.model.CatAccountStatusDO
import com.library.management.system.domain.model.CatBookFormatDO
import com.library.management.system.domain.model.CatBookStatusDO
import com.library.management.system.domain.model.CatReservationStatusDO
import com.library.management.system.domain.repository.CatAccountStatusRepository
import com.library.management.system.domain.repository.CatBookFormatRepository
import com.library.management.system.domain.repository.CatBookStatusRepository
import com.library.management.system.domain.repository.CatReservationStatusRepository
import com.library.management.system.infra.repository.CatAccountStatusJPARepository
import com.library.management.system.infra.repository.CatBookFormatJPARepository
import com.library.management.system.infra.repository.CatBookStatusJPARepository
import com.library.management.system.infra.repository.CatReservationStatusJPARepository
import com.library.management.system.infra.repository.entities.CatAccountStatusEntity
import com.library.management.system.infra.repository.entities.CatBookFormatEntity
import com.library.management.system.infra.repository.entities.CatBookStatusEntity
import com.library.management.system.infra.repository.entities.CatReservationStatusEntity
import org.springframework.stereotype.Repository

@Repository
class CatAccountRepositoryImpl(val repository: CatAccountStatusJPARepository): CatAccountStatusRepository {

    override fun create(catAccountStatusDO: CatAccountStatusDO): CatAccountStatusDO {
        val entity = CatAccountStatusEntity(description = catAccountStatusDO.description)
        repository.save(entity)
        return buildDO(entity)
    }

    fun buildDO(catAccountStatusEntity: CatAccountStatusEntity): CatAccountStatusDO {
        return CatAccountStatusDO(id = catAccountStatusEntity.id, description = catAccountStatusEntity.description,
            createdAt = catAccountStatusEntity.createdAt)
    }

}

@Repository
class CatReservationRepositoryImpl(val repository: CatReservationStatusJPARepository):
    CatReservationStatusRepository {
    override fun create(catReservationStatus: CatReservationStatusDO): CatReservationStatusDO {
        val entity = CatReservationStatusEntity(description = catReservationStatus.description)
        repository.save(entity)
        return buildDO(entity)
    }

    fun buildDO(catReservationStatusEntity: CatReservationStatusEntity): CatReservationStatusDO {
        return CatReservationStatusDO(id = catReservationStatusEntity.id, description = catReservationStatusEntity.description,
            createdAt = catReservationStatusEntity.createdAt)
    }

}

@Repository
class CatBookStatusRepositoryImpl(val repository: CatBookStatusJPARepository):
    CatBookStatusRepository {
    override fun create(catBookStatus: CatBookStatusDO): CatBookStatusDO {
        val entity = CatBookStatusEntity(description = catBookStatus.description)
        repository.save(entity)
        return buildDO(entity)
    }

    fun buildDO(entity: CatBookStatusEntity): CatBookStatusDO {
        return CatBookStatusDO(id = entity.id, description = entity.description,
            createdAt = entity.createdAt)
    }

}

@Repository
class CatBookFormatRepositoryImpl(val repository: CatBookFormatJPARepository): CatBookFormatRepository {
    override fun create(catBookFormat: CatBookFormatDO): CatBookFormatDO {
        val entity = CatBookFormatEntity(description = catBookFormat.description)
        repository.save(entity)
        return buildDO(entity)
    }

    fun buildDO(entity: CatBookFormatEntity): CatBookFormatDO {
        return CatBookFormatDO(id = entity.id, description = entity.description,
            createdAt = entity.createdAt)
    }

}