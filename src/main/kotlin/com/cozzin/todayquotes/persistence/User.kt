package com.cozzin.todayquotes.persistence

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity(name = "actor")
data class User(
    @Id @GeneratedValue(strategy = GenerationType.UUID) var internalUserId: String? = null,
    @Column(unique = true) @JsonProperty("device_id") val deviceId: String
) {
    val userId: String
        get() = internalUserId ?: throw NullPointerException()
}
