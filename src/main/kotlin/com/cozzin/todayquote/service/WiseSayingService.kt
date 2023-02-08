package com.cozzin.todayquote.service

import com.cozzin.todayquote.persistence.WiseSaying
import com.cozzin.todayquote.persistence.WiseSayingRepository
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
