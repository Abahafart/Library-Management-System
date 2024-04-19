package com.library.management.system.infra.repository.entities

import org.bson.types.ObjectId
import java.time.LocalDate
import java.time.LocalDateTime

data class AuthorEntity(val id: ObjectId = ObjectId.get(), val name: String, val description: String,
                        val createdAt: LocalDateTime = LocalDateTime.now())
data class LibraryEntity(val id: ObjectId = ObjectId.get(), val name: String, val address: String,
                         val createdAt: LocalDateTime = LocalDateTime.now())
data class BookEntity(val id: ObjectId = ObjectId.get(), val ISBN: String, val title: String,
    val subject: String, val publisher: String, val language: String,val numberOfPages: Int,
    val createdAt: LocalDateTime = LocalDateTime.now(), val authorId: ObjectId)
data class BookItemEntity(val id: ObjectId = ObjectId.get(), val barcode: String, val isReferenceOnly: Boolean,
    val borrowed: LocalDate, val dueDate: LocalDate, val price: Double, val format: String,
    val status: String, val dateOfPurchase: LocalDate, val publicationDate: LocalDate)
data class AccountEntity(val id: ObjectId = ObjectId.get(), val password: String, val status: String,
    val personId: ObjectId)
data class LibraryCardEntity(val id: ObjectId = ObjectId.get(), val cardNumber: String, val barcode: String,
    val issuedAt: LocalDateTime, val active: Boolean, val createdAt: LocalDateTime = LocalDateTime.now(),
    val accountId: ObjectId)
data class BarcodeReaderEntity(val id: ObjectId = ObjectId.get(), val registeredAt: LocalDateTime,
    val active: Boolean, val createdAt: LocalDateTime = LocalDateTime.now())
data class BookReservationEntity(val id: ObjectId = ObjectId.get(), val creationDate: LocalDate,
    val status: String, val createdAt: LocalDateTime = LocalDateTime.now(), val accountId: ObjectId,
    val bookItemId: ObjectId)
data class BookLendingEntity(val id: ObjectId = ObjectId.get(), val creationDate: LocalDate, val dueDate: LocalDate,
    val returnDate: LocalDate, val accountId: ObjectId, val bookItemId: ObjectId)
data class FineEntity(val id: ObjectId = ObjectId.get(), val amount: Double, val accountId: ObjectId)
data class FineTransactionEntity(val id: ObjectId = ObjectId.get(), val amount: Double, val creationDate: LocalDate,
                                 val accountId: ObjectId)