package com.cozzin.todayquotes.service

import com.cozzin.todayquotes.persistence.User
import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.util.Assert

@SpringBootTest
internal class UserServiceTest {

    @Autowired
    lateinit var service: UserService

    @Test
    fun saveUser() {
        val user = User(deviceId = "test_device_id")
        val savedUser = service.save(user)
        val savedUserId = savedUser.userId
        val foundUser = service.findById(savedUserId)
        assertThat(foundUser.get()).isEqualTo(savedUser)
    }
}