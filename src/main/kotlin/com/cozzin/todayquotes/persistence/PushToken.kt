package com.cozzin.todayquotes.persistence

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
data class PushToken(
    @Id @JsonProperty("user_id") val userId: String,
    @JsonProperty("push_token") var token: String
)
