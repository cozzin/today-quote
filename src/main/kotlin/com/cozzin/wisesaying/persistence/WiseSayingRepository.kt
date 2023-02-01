package com.cozzin.wisesaying.persistence

import org.springframework.data.repository.CrudRepository

interface WiseSayingRepository: CrudRepository<WiseSaying, Long> {
}
