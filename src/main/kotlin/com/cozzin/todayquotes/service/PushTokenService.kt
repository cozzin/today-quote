package com.cozzin.todayquotes.service

import com.cozzin.todayquotes.persistence.PushToken
import com.cozzin.todayquotes.persistence.PushTokenRepository
import org.springframework.stereotype.Service

@Service
class PushTokenService(private val repository: PushTokenRepository) {
    fun save(pushToken: PushToken) {
        repository.save(pushToken)
    }

    @Throws(NoSuchElementException::class)
    fun update(pushToken: PushToken) {
        val exitingToken = repository.findById(pushToken.userId)

        exitingToken.ifPresentOrElse({
            it.token = pushToken.token
            repository.save(it)
        }, {
            throw NoSuchElementException()
        })
    }
}