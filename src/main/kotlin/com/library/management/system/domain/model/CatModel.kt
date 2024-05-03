package com.library.management.system.domain.model

import java.time.Instant

data class CatAccountStatusDO(val id: Long? = null, val description: String, val createdAt: Instant? = Instant.now())