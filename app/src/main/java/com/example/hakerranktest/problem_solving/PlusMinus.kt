package com.example.hakerranktest.problem_solving

class PlusMinus {

    //region variables
    private var positiveNumber = 0
    private var negativeNumber = 0
    private var zerosNumber = 0


    //endregion

    //region functions
    fun solve1(a: Array<Int>) {

        for (number in a) {
            if (number > 0)
                positiveNumber++
            if (number < 0)
                negativeNumber++

            if (number == 0)
                zerosNumber++
        }

        println("%.6f".format(  positiveNumber / a.size.toDouble()))
        println("%.6f".format(  negativeNumber / a.size.toDouble()))
        println("%.6f".format(  zerosNumber / a.size.toDouble()))



    }

    fun solve2(a: Array<Int>) {

        positiveNumber=a.count { it>0 }
        negativeNumber=a.count { it<0 }
        zerosNumber=a.count { it==0 }



        println("%.6f".format(  positiveNumber / a.size.toDouble()))
        println("%.6f".format(  negativeNumber / a.size.toDouble()))
        println("%.6f".format(  zerosNumber / a.size.toDouble()))
    }
    //endregion
}