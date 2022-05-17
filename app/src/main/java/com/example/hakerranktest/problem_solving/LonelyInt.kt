package com.example.hakerranktest.problem_solving

class LonelyInt {
    fun lonelyinteger(a: Array<Int>): Int {
        var lonelyInt = 0
        a.forEach { currentNUmber ->
            if (a.count { it == currentNUmber } == 1)
                lonelyInt = currentNUmber
        }
        return lonelyInt
    }
}