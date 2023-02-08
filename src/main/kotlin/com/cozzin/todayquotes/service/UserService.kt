package com.cozzin.todayquotes.service

import com.cozzin.todayquotes.persistence.User
import com.cozzin.todayquotes.persistence.UserRepository
import org.springframework.stereotype.Service
import java.util.Optional

@Service
class UserService(private val repository: UserRepository) {
    fun save(user: User): User {
        return repository.save(user)
    }

    fun findById(userId: String): Optional<User> {
        return repository.findById(userId)
    }

    fun findByDeviceId(deviceId: String): Optional<User> {
        return repository.findByDeviceId(deviceId = deviceId)
    }
}