package com.cozzin.todayquote

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WiseSayingApplication

fun main(args: Array<String>) {
	runApplication<WiseSayingApplication>(*args) {
		setBannerMode(Banner.Mode.OFF)
	}
}
