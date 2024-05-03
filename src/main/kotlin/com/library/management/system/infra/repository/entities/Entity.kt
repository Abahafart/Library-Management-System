package com.library.management.system.infra.repository.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.Instant

@Entity(name = "cat_account_status")
class CatAccountStatusEntity(
    @Column val description: String,
    @Column val createdAt: Instant = Instant.now(),
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null
)