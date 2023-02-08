package com.cozzin.todayquotes.persistence

import org.springframework.data.repository.CrudRepository

interface PushTokenRepository: CrudRepository<PushToken, String> {
}
