package com.cozzin.wisesaying

import com.cozzin.wisesaying.persistence.WiseSaying
import com.cozzin.wisesaying.service.WiseSayingService
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class WiseSayingController(val service: WiseSayingService) {

    @GetMapping("/")
    fun blog(model: Model): List<WiseSaying> {
        return service.findAll();
    }
}
