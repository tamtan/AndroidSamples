package kotlinprogram

//There are two sorted arrays nums1 and nums2 of size m and n respectively.
//
//Find the kotlin.median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
//
//You may assume nums1 and nums2 cannot be both empty.
//
//Example 1:
//
//nums1 = [1, 3]
//nums2 = [2]
//
//The kotlin.median is 2.0
//Example 2:
//
//nums1 = [1, 2]
//nums2 = [3, 4]
//
//The kotlin.median is (2 + 3)/2 = 2.5

fun main(args: Array<String>) {
    val nums1 = intArrayOf(1, 3)
    val nums2 = intArrayOf(2, 4)
    println(findMedianSortedArrays(nums1, nums2))
    println(findMedianSortedArrays1(nums1, nums2))
}

fun findMeidanSortedArrays2(nums1: IntArray, nums2: IntArray): Double {

    // edge cases
    if(nums1.size == 0 && nums2.size == 0) return 0.0

    val totalSize = nums1.size + nums2.size
    val isOdd = totalSize%2 != 0
    val mid = if(isOdd) totalSize/2 else totalSize/2

    var cnt = 0
    var c1 = 0
    var c2 = 0

    var current: Double = 0.0
    while(cnt <= mid) {

        val previous = current

        val check1: Double = if(nums1.size > c1) nums1[c1].toDouble() else Double.MAX_VALUE
        val check2: Double = if(nums2.size > c2) nums2[c2].toDouble() else Double.MAX_VALUE

        if(check1 <= check2)  {
            current = check1
            c1++
        } else {
            current = check2
            c2++
        }

        if(cnt == mid) {

            if(isOdd) {
                return current
            } else {
                return (current + previous) / 2
            }
        }

        cnt++
    }

    return 0.0
}

fun findMedianSortedArrays1(nums1: IntArray, nums2: IntArray): Double {
    return nums1.plus(nums2).apply{sort()}.median()?:0.0
}

private fun IntArray.median(): Double?{
    if(this.isEmpty()){
        return null
    }

    return if(size%2 == 1){
        this[size/2].toDouble()
    }else{
        (this[(size/2)-1] + this[(size/2)])/2.0
    }
}

fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val sort = nums1.plus(nums2).sorted()
    val mid = sort.size / 2
    return if (sort.size % 2 == 0)
        (sort[mid] + sort[mid - 1]).toDouble() / 2
    else sort[mid].toDouble()
}