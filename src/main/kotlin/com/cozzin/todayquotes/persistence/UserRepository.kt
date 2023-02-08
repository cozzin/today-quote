package com.cozzin.todayquotes.persistence

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import java.util.*

interface UserRepository: CrudRepository<User, String> {
    @Query("select u from actor AS u where u.deviceId = :deviceId")
    fun findByDeviceId(@Param("deviceId") deviceId: String): Optional<User>
}