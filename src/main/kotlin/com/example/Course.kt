package com.example

import io.micronaut.core.annotation.Introspected
import java.time.LocalDate

@Introspected
data class Course(val name: String, val author: String, val date: LocalDate)
