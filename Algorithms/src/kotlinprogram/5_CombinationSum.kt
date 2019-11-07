package kotlinprogram

fun main(arg: Array<String>){
    val arr = intArrayOf(2,3,6,7)
    combinationSum(arr, 7)
}

fun combinationSum(candidates: IntArray, target: Int): List<List<Int>>{
    var result = mutableListOf<List<Int>>()
    candidates.sort() //1. sort array
    backTracking(candidates, target, result, mutableListOf(), 0) //2. backtracking in sorted array
    return result
}

fun backTracking(candidates: IntArray, surplus: Int, result: MutableList<List<Int>>, temp: MutableList<Int>, start: Int){
    for(curIndex in start until candidates.size){
        var curNumber = candidates[curIndex]
        temp.add(candidates[curIndex])
        when{
            curNumber == surplus->{
                result.add(temp.toMutableList()) //we call 'toMutableList()' to create new Mutable List.
            }

            curNumber< surplus ->{
                backTracking(candidates, surplus - curNumber, result, temp, curIndex)
            }
        }
        temp.remove(curNumber)
    }
}