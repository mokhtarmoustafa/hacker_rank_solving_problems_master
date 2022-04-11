package com.example.hakerranktest.problem_solving

import kotlin.math.abs

class DiagonalDifference {
    var diagonal1 = 0
    var diagonal2 = 0
    private var differenceTotal = 0
    var arraySize = 0

    fun solve1(arraysData: Array<Array<Int>>): Int {

        arraySize = arraysData.size

        for (i in 0 until arraySize)
        {
           diagonal1+=arraysData[i][i]
            diagonal2+=arraysData[i][arraySize-i-1]
        }
        differenceTotal= abs(diagonal1-diagonal2)

            return differenceTotal
    }

}