package com.cozzin.todayquotes

import com.cozzin.todayquotes.persistence.User
import org.junit.jupiter.api.Test

class UserTest {
    @Test
    fun user() {
        val user = User(deviceId = "my_device_id")
        print(user.id)
    }
}