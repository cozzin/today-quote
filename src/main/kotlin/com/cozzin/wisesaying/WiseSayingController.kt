package com.cozzin.wisesaying

import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class WiseSayingController {

    @GetMapping("/")
    fun blog(model: Model): String {
        model["title"] = "Hey"
        return "blog"
    }
}