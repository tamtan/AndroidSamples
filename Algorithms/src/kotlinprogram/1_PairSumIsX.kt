package kotlinprogram

fun main(arg: Array<String>) {
    print(twoSum(intArrayOf(2, 7, 11, 15), 9).joinToString(","))
}

fun findPair(arr: IntArray, sum: Int): IntArray {
    var result: IntArray = IntArray(2)
    var map = mutableSetOf<Int>()
    for (i in arr) {
        if (map.contains(sum - i)) {
            result[0] = sum - i
            result[1] = i
        } else {
            map.add(i)
        }
    }

    return result
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    var result = IntArray(2)
    var map = hashMapOf<Int, Int>()
    for(i in 0..nums.size-1){
        if(map.containsKey(target - nums[i])){
            result[0] = map.get(target - nums[i])!!
            result[1] = i
        }else{
            map.put(nums[i], i)
        }
    }
    return result
}