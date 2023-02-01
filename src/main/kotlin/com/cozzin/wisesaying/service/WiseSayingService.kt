package com.cozzin.wisesaying.service

import com.cozzin.wisesaying.persistence.WiseSaying
import com.cozzin.wisesaying.persistence.WiseSayingRepository
import org.springframework.stereotype.Service

@Service
class WiseSayingService(val repository: WiseSayingRepository) {
    public fun findAll(): List<WiseSaying> {
        return repository.findAll().toList()
    }

    public fun save(wiseSaying: WiseSaying) {
        repository.save(wiseSaying)
    }
}
