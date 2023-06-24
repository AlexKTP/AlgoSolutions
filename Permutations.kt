class Solution {
  fun permute(nums: IntArray): List<List<Int>> {
    var result = mutableListOf<List<Int>>()
    var current = mutableListOf<Int>()
    var visited = mutableSetOf<Int>()
    fun backtrack(){
        if (current.size == nums.size) {
            result.add(current.toList())
            return
        }
        for (i in 0 until nums.size) {
            if (visited.contains(nums[i])) continue
            current.add(nums[i])
            visited.add(nums[i])
            backtrack()
            current.removeAt(current.size - 1)
            visited.remove(nums[i])
        }
    }
    backtrack()
    return result
}
}
