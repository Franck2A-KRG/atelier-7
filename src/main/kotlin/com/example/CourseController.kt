package com.example

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/courses")
class CourseController(private val courseManager: CourseManager) {

    @Get("/random")
    fun randomCourse(): Course {
        return courseManager.random()
    }
}
