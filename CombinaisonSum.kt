class Solution {
    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> 
{
        val result = mutableSetOf<List<Int>>()
        dfs(0, 0,candidates, target,mutableListOf(), result)
        return result.toList()
    }
}

private fun dfs(
    index: Int,
    sum: Int,
    candidates: IntArray,
    target: Int,
    path: MutableList<Int>,
    result: MutableSet<List<Int>>
) {
    if (sum == target) {
        result.add(path.toList())
        return
    }

    if (sum > target) {
        return
    }

    for (i in index until candidates.size) {
        path.add(candidates[i])
        dfs(i, sum + candidates[i], candidates, target, path, result)
        path.removeAt(path.size - 1)
    }
}
