package com.library.management.system.infra.repository

import com.library.management.system.infra.repository.entities.CatAccountStatusEntity
import org.springframework.data.jpa.repository.JpaRepository

interface CatAccountStatusJPARepository : JpaRepository<CatAccountStatusEntity, Long>{}
