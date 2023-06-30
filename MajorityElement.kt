class Solution {
    fun majorityElement(nums: IntArray): Int {
        val map = mutableMapOf<Int, Int>()
        nums.forEach{if(map.containsKey(it)) map[it] = map[it]!! + 1 else map.put(it, 1)}
        return map.toSortedMap(compareBy { map[it] }).entries.last().key


    }
}