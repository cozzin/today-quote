package com.cozzin.todayquotes

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TodayQuotesApplication

fun main(args: Array<String>) {
	runApplication<TodayQuotesApplication>(*args) {
		setBannerMode(Banner.Mode.OFF)
	}
}
