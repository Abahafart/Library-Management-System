package com.library.management.system.infra.controller.response

import java.time.Instant

data class CatAccountStatusResponse(val id: Long?, val description: String, val createdAt: Instant?);
data class CatReservationStatusResponse(val id: Long?, val description: String, val createdAt: Instant?);
data class CatBookStatusResponse(val id: Long?, val description: String, val createdAt: Instant?);
data class CatBookFormatResponse(val id: Long?, val description: String, val createdAt: Instant?);