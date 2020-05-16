package com.example

import java.time.LocalDate
import javax.inject.Singleton

@Singleton
class CourseManagerImpl : CourseManager {

    companion object {
        val COURSES = listOf(
                Course("Atelier #1 Index sur MySQL, MongoDB et InfluxDB", "Franck", LocalDate.of(2020, 2, 17)),
                Course("Atelier #2 Agrégation en MongoDB", "Alexandre", LocalDate.of(2020, 3, 9)),
                Course("Atelier #3 ReactiveX", "Gautier", LocalDate.of(2020, 3, 30)),
                Course("Atelier #4 spring-aop", "Florian", LocalDate.of(2020, 4, 20)),
                Course("Atelier #5 Nouveautés de Java 9 à 11", "Jean-Damien", LocalDate.of(2020, 5, 11)),
                Course("Atelier #6 Méthodologie de nommage BEM (CSS)", "Olivier", LocalDate.of(2020, 6, 22))
        )
    }

    override fun random(): Course {
        return COURSES.random()
    }
}
