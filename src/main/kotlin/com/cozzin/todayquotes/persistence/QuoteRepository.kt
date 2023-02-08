package com.cozzin.todayquotes.persistence

import org.springframework.data.repository.CrudRepository

interface QuoteRepository: CrudRepository<Quote, Long> {
}
