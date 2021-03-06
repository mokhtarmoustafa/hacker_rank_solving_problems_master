package com.example.hakerranktest.problem_solving

class MinMaxSum {

    fun solve(arr: Array<Int>): Unit {
        var minSum = 0L
        var maxSum = 0L
        // Write your code here
        arr.sort()
        val size = arr.size
        for (i in 0 until size) {
            if (i < 4)
                minSum += arr[i]
            if (i > 0)
                maxSum += arr[i]
        }

        println("$minSum $maxSum")
    }

    fun solve2(arr: Array<Int>)
    {
        var max=0L
        var min=0L
        arr.sort()
        arr.slice(0..3).forEach { min+=it }
        arr.slice(1..4).forEach { max+=it }

        println("$min $max")
    }

}