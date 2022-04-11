package com.example.hakerranktest.problem_solving

class CompareTheTriplets {
    //region variables
    private var aliceCounter = 0
    private var bobCounter = 0
    private lateinit var result: Array<Int>

    //endregion

    //region functions

    fun solve1(a: Array<Int>, b: Array<Int>): Array<Int> {
        if (a[0] > b[0])
            aliceCounter += 1

        if (a[1] > b[1])
            aliceCounter += 1

        if (a[2] > b[2])
            aliceCounter += 1

        if (b[0] > a[0])
            bobCounter += 1

        if (b[1] > a[1])
            bobCounter += 1

        if (b[2] > a[2])
            bobCounter += 1

        result = arrayOf(aliceCounter, bobCounter)
        return result
    }


    //endregion
}