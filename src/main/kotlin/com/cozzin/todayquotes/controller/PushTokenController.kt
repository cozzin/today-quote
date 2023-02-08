package com.cozzin.todayquotes.controller

import com.cozzin.todayquotes.persistence.PushToken
import com.cozzin.todayquotes.service.PushTokenService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException

@RestController
class PushTokenController(private val service: PushTokenService) {

    @PostMapping("/push-tokens")
    @ResponseStatus(HttpStatus.CREATED)
    fun savePushToken(@RequestBody pushToken: PushToken) {
        service.save(pushToken = pushToken)
    }

    @PutMapping("/push-tokens")
    @ResponseStatus(HttpStatus.OK)
    fun updatePushToken(@RequestBody pushToken: PushToken) {
        try {
            service.update(pushToken = pushToken)
        } catch (e: NoSuchElementException) {
            throw ResponseStatusException(HttpStatus.NO_CONTENT, "entity not found")
        }
    }
}