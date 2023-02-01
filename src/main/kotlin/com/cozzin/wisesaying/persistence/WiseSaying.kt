package com.cozzin.wisesaying.persistence

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class WiseSaying constructor(
        @Id @GeneratedValue private val id: Long,
        @JsonProperty("word") val word: String,
        @JsonProperty("img_url") val imageUrl: String
)