package com.cozzin.todayquotes.persistence

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
data class Quote(
        @Id @GeneratedValue val id: Long?,
        @JsonProperty("word") val word: String,
        @JsonProperty("img_url") val imageUrl: String
)