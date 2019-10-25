package kotlinprogram

//1. Two Sum
//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//Example:
//
//Given nums = [2, 7, 11, 15], target = 9,
//
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].

fun main(args: Array<String>) {
    val arr = intArrayOf(2, 7, 9, 10)
    println(twoSum2(arr, 9).contentToString())
}
fun twoSum2(nums: IntArray, target: Int): IntArray {
    val map: MutableMap<Int, Int> = HashMap()

    nums.indices.forEach { curPosition ->
        val curNum = nums[curPosition]

        //curNum == target - addend
        val positionOfAddend: Int? = map[curNum]

        if (positionOfAddend != null && curPosition != positionOfAddend) {
            val pair = IntArray(2)
            pair[0] = positionOfAddend!!
            pair[1] = curPosition
            return pair
        }

        map[target - curNum] = curPosition
    }

    return IntArray(2)
}
fun twoSum1(nums: IntArray, target: Int) : IntArray {
    val result = IntArray(2)
    val visited = mutableMapOf<Int, Int>()
    nums.forEachIndexed{
        index, num ->
        val key = target - num
        if(visited.containsKey(key)){
            result[0] = visited[key]!!
            result[1] = index
            return@forEachIndexed
        }else{
            visited[num] = index
        }
    }
    return result
}
fun twoSum(nums: IntArray, target: Int): IntArray {
    for (i in 0 until nums.size - 1)
        for (j in i + 1 until nums.size)
            if (nums[i] + nums[j] == target)
                return intArrayOf(i, j)
    return intArrayOf()
}


