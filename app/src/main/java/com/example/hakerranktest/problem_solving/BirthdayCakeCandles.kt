package com.example.hakerranktest.problem_solving


class BirthdayCakeCandles {

    fun solve1(array: Array<Int>): Int {
        array.sortDescending()
        var first = array[0]
        var count = array.count { it == first }
        return count

    }

    fun solve2(array: Array<Int>): Int {
        val max = array.maxOrNull()
        return array.count { it == max }
    }
}