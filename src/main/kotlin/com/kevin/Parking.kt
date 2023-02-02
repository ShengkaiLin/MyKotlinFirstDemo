package com.kevin

import java.time.Duration
import java.time.LocalDateTime
import kotlin.math.ceil

fun main(args: Array<String>) {
    val enter = LocalDateTime.of(
        2018,
        12, 25, 8, 0, 0
    )

    val leave = LocalDateTime.of(
        2018,
        12, 25, 8, 8, 0
    )

    val car = Car("AWR-8119", enter)
    car.leave = leave

    println(car.duration())

    val hours = ceil(car.duration()/60.0).toLong()
    println(hours)
}


class Car(val id: String, val enter: LocalDateTime) {

    var leave: LocalDateTime? = null
        set(value) {
            if (enter.isBefore(value)) {
                field = value
            }
        }

    fun duration() = Duration.between(enter, leave).toMinutes()

}