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
        var sum=0L
        arr.sort()
        val minSum=arr.slice(0..3).sum().toLong()
        arr.slice(1..4).forEach { sum+=it }
        val maxSum=sum
        println("$minSum $maxSum")
    }

}