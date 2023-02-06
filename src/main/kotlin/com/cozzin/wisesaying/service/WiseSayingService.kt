package com.cozzin.wisesaying.service

import com.cozzin.wisesaying.persistence.WiseSaying
import com.cozzin.wisesaying.persistence.WiseSayingRepository
import org.springframework.stereotype.Service

@Service
class WiseSayingService(private val repository: WiseSayingRepository) {
    fun findAll(): List<WiseSaying> {
        return repository.findAll().toList()
    }

    fun save(wiseSaying: WiseSaying) {
        repository.save(wiseSaying)
    }
}
