package com.example.hakerranktest.problem_solving

class PlusMinus {

    //region variables
    private var positiveNumber = 0
    private var negativeNumber = 0
    private var zerosNumber = 0


    //endregion

    //region functions
    fun solve1(a: Array<Int>): Array<Double> {

        for (number in a) {
            if (number > 0)
                positiveNumber++
            if (number < 0)
                negativeNumber++

            if (number == 0)
                zerosNumber++
        }

        return arrayOf(
            positiveNumber / a.size.toDouble(),
            negativeNumber / a.size.toDouble(),
            zerosNumber / a.size.toDouble()
        )
    }
    //endregion
}