package com.example.hakerranktest

import com.example.hakerranktest.problem_solving.SimpleArraySum

fun main(args: Array<String>) {

//region Simple Array Sum
val simpleArraySum= arrayOf(1,5,10,15,30)
    //complex
    val value1=SimpleArraySum().getSimpleArraySum(simpleArraySum)
    println(value1)

    //simple
    val value2=SimpleArraySum().getSimpleArraySumEasy(simpleArraySum)
    println(value2)

    //endregion
}
