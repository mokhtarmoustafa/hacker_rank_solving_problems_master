package com.example.hakerranktest

import com.example.hakerranktest.problem_solving.CompareTheTriplets

fun main(args: Array<String>) {

    val aliceArray = arrayOf( 5, 6, 7)
    val bobArray = arrayOf(3,6,10)
    val result = CompareTheTriplets().solve1(aliceArray,bobArray)

    println(result.joinToString(" "))



}
