package com.example

// BenchmarkController is a controller
// It has only 1 method benchmark accessible on GET /benchmark

?
class BenchmarkController {

    ?
    fun benchmark(): Double {
        // generate first value with Java Random implementation
        var result: Double = ?

        // loop from 0 to 1_000_000
        // calculate sin from previous result
        // and println result
        for (?) {
            result = ?
            println(?)
        }

        return result
    }
}
