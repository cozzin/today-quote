package com.cozzin.wisesaying.controller

import com.cozzin.wisesaying.persistence.WiseSaying
import com.cozzin.wisesaying.service.WiseSayingService
import org.springframework.http.HttpStatus
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class WiseSayingController(val service: WiseSayingService) {

    @GetMapping("/")
    fun helloWorld(): String {
        return "hello world";
    }

    @GetMapping("/sayings")
    fun findAll(model: Model): List<WiseSaying> {
        return service.findAll();
    }

    @PostMapping("/sayings")
    @ResponseStatus(HttpStatus.CREATED)
    fun save(@RequestBody wiseSaying: WiseSaying) {
        service.save(wiseSaying);
    }
}
