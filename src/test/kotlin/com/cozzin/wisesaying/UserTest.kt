package com.cozzin.wisesaying

import com.cozzin.wisesaying.persistence.User
import org.junit.jupiter.api.Test

class UserTest {
    @Test
    fun user() {
        val user = User(deviceId = "my_device_id")
        print(user.id)
    }
}