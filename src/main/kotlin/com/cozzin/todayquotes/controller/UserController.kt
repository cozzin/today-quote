package com.cozzin.todayquotes.controller

import com.cozzin.todayquotes.persistence.User
import com.cozzin.todayquotes.service.UserService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(private val service: UserService) {
    @PostMapping("/auto-login")
    fun save(@RequestBody user: User): User {
        val existingUser = service.findByDeviceId(user.deviceId)

        return if (existingUser.isPresent) {
            existingUser.get()
        } else {
            service.save(user)
        }
    }
}