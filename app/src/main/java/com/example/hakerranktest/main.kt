package com.example.hakerranktest

import com.example.hakerranktest.problem_solving.CompareTheTriplets
import com.example.hakerranktest.problem_solving.PlusMinus

fun main(args: Array<String>) {

    val array = arrayOf( 1,1,0,-1,-1)


    val result = PlusMinus().solve1(array)

    println(result.joinToString(" "))



}
