package com.library.management.system.infra.repository.impl

import com.library.management.system.domain.model.CatAccountStatusDO
import com.library.management.system.domain.repository.CatAccountStatusRepository
import com.library.management.system.infra.repository.CatAccountStatusJPARepository
import com.library.management.system.infra.repository.entities.CatAccountStatusEntity
import org.springframework.stereotype.Repository

@Repository
class CatAccountRepositoryImpl(val catAccountStatusJPARepository: CatAccountStatusJPARepository): CatAccountStatusRepository {

    override fun create(catAccountStatusDO: CatAccountStatusDO): CatAccountStatusDO {
        val entity = buildEntity(catAccountStatusDO)
        val accountStatusEntity = catAccountStatusJPARepository.save(entity)
        return buildDO(accountStatusEntity)
    }

    fun buildEntity(catAccountStatusDO: CatAccountStatusDO): CatAccountStatusEntity {
        return CatAccountStatusEntity(description = catAccountStatusDO.description)
    }
    fun buildDO(catAccountStatusEntity: CatAccountStatusEntity): CatAccountStatusDO {
        return CatAccountStatusDO(id = catAccountStatusEntity.id, description = catAccountStatusEntity.description,
            createdAt = catAccountStatusEntity.createdAt)
    }

}