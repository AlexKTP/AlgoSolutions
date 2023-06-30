class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        val size = m + n
        val result = mutableListOf<Int>()
        result.addAll(nums1.filter{it != 0}.toList())
        result.addAll(nums2.toList())
        while (result.size < m + n) result.add(0)
        result.sort()
        for(i in 0..size-1){
            if(i< result.size)nums1[i] = result[i]
        }
    }
}