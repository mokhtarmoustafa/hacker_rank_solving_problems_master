package com.example.hakerranktest.problem_solving

class StairCase {

    fun solve(number:Int)
    {
        for (i in 1..number) {
            for (y in 1.. number-i) {
                print(" ")
            }
            for (x in 1..i)
            {
                print("#")
            }
            println()

        }

    }
}