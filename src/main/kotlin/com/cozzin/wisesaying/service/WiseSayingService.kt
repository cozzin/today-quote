package com.cozzin.wisesaying.service

import com.cozzin.wisesaying.persistence.WiseSaying
import org.springframework.stereotype.Service

@Service
class WiseSayingService {
    public fun findAll(): List<WiseSaying> {
        return listOf(WiseSaying(id = 1, word = "test word", imageUrl = "my url"))
    }
}