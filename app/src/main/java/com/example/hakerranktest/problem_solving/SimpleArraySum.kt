package com.example.hakerranktest.problem_solving

/*
    * Simple Array Sum
    * Given an array of integers, find the sum of its elements.

For example, if the array ar=[1,2,3] , , so 1+2+3 return =6 .

Function Description

Complete the simpleArraySum function in the editor below. It must return the sum of the array elements as an integer.

simpleArraySum has the following parameter(s):

ar: an array of integers
Input Format

The first line contains an integer, , denoting the size of the array.
The second line contains  space-separated integers representing the array's elements.

Constraints
0<n,ar[i]<=1000

Output Format

Print the sum of the array's elements as a single integer.

Sample Input

6
1 2 3 4 10 11
Sample Output

31
Explanation

We print the sum of the array's elements: .*/
class SimpleArraySum {
    //region solving  - complex way
    fun getSimpleArraySum(arrayData: Array<Int>): Int {
        var arrayTotal = 0

        arrayData.forEach { number ->
            arrayTotal += number
        }
        return arrayTotal
    }

    //

    //region solving  - easy way
    fun getSimpleArraySumEasy(arrayData: Array<Int>): Int {
        return arrayData.sum()
    }
    //endregion

}