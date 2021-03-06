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

    fun solve2(a: Array<Int>, b: Array<Int>): Array<Int> {

        for (i in 0..2) {
            if (a[i] > b[i])
                aliceCounter++
            if (b[i] > a[i])
                bobCounter++
        }
        result = arrayOf(aliceCounter, bobCounter)
        return result
    }


    fun solve3(a:Array<Int>,b:Array<Int>):Array<Int>
    {
        aliceCounter=a.zip(b).count { it.first>it.second }
        bobCounter=b.zip(a).count{it.first>it.second}
        return arrayOf(aliceCounter,bobCounter)
    }
    //endregion
}