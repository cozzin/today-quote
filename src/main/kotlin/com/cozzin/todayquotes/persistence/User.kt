package com.cozzin.todayquotes.persistence

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
data class User(
        @JsonProperty("device_id") val deviceId: String,
) {
    @Id @GeneratedValue @JsonProperty("user_id") var id: String? = null
}