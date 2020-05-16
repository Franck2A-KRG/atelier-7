package com.example

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import java.util.*
import kotlin.math.sin

@Controller("/benchmark")
class BenchmarkController {

    @Get
    fun benchmark(): Double {
        var result: Double = Random().nextDouble()

        for (x in 0 until 500_000) {
            result = sin(result)
            println("sin($x): $result")
        }

        return result
    }
}
