package com.example.hakerranktest.problem_solving

class CamelCase {

    fun solve1(phrase: String): Int {
       return phrase.split(Regex("[A-Z]")).size
    }
}