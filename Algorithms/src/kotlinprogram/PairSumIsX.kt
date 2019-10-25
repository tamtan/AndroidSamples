package kotlinprogram

fun main(arg: Array<String>){
    print(findPair(intArrayOf(2, 7, 11, 15), 9).joinToString(","))
}

fun findPair(arr: IntArray, sum: Int): IntArray {
    var result: IntArray = IntArray(2)
    var map = hashMapOf<Int, Int>()
    for(i in arr){
        if(map.containsKey(sum - i)){
            result[0] = map.get(sum - i)!!
            result[1] = i
        }
    }

    return result
}