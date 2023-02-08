package com.cozzin.todayquotes.controller

import com.cozzin.todayquotes.persistence.Quote
import com.cozzin.todayquotes.service.QuoteService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class QuoteController(private val service: QuoteService) {

    @GetMapping("/")
    fun helloWorld(): String {
        return "hello world"
    }

    @GetMapping("/quotes")
    fun findAll(): List<Quote> {
        return service.findAll()
    }

    @PostMapping("/quotes")
    @ResponseStatus(HttpStatus.CREATED)
    fun save(@RequestBody quote: Quote) {
        service.save(quote)
    }
}
