package com.example.hakerranktest

import com.example.hakerranktest.problem_solving.DiagonalDifference

fun main(args: Array<String>) {

    val array1 = arrayOf( 1,2,19)
    val array2 = arrayOf( 5,4,6)
    val array3 = arrayOf( 7,8,9)


    val result = DiagonalDifference().solve1(arrayOf(array1,array2,array3))

    println(result)



}
