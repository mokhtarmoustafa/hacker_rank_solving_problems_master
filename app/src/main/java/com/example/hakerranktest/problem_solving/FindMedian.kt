package com.example.hakerranktest.problem_solving

class FindMedian {
    fun solve(arr:Array<Int>):Int{
        var pointer:Int=(arr.size-1)/2
        arr.sort()
        var median= arr[pointer]

        return median

    }
}