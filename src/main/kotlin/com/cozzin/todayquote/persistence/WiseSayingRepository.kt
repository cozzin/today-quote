package com.cozzin.todayquote.persistence

import org.springframework.data.repository.CrudRepository

interface WiseSayingRepository: CrudRepository<WiseSaying, Long> {
}
