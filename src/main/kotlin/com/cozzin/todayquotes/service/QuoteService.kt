package com.cozzin.todayquotes.service

import com.cozzin.todayquotes.persistence.Quote
import com.cozzin.todayquotes.persistence.QuoteRepository
import org.springframework.stereotype.Service

@Service
class QuoteService(private val repository: QuoteRepository) {
    fun findAll(): List<Quote> {
        return repository.findAll().toList()
    }

    fun save(quote: Quote) {
        repository.save(quote)
    }
}
