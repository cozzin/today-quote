package com.cozzin.wisesaying

import com.cozzin.wisesaying.persistence.WiseSaying
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class WiseSayingController {

    @GetMapping("/")
    fun blog(model: Model): List<WiseSaying> {
        return listOf(WiseSaying(id = 1, word = "test word", imageUrl = "my url"))
    }
}
