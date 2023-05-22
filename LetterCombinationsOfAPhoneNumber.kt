class Solution {
    fun letterCombinations(digits: String): List<String> {
    val mm = mapOf(
        '2' to "abc",
        '3' to "def",
        '4' to "ghi",
        '5' to "jkl",
        '6' to "mno",
        '7' to "pqrs",
        '8' to "tuv",
        '9' to "wxyz"
    )
    var res = mutableListOf<String>()
    if (digits.length == 0) return res
    var word = ""
    fun loopRecursive(cur: Int) {
        if (cur < digits.length) {
            for (i in mm[digits[cur]]!!) {
                word += i
                loopRecursive(cur + 1)
                println()
                word = word.substring(0, word.length - 1)
            }
        } else {
            res.add(word)
        }

    }
    loopRecursive(0)
    return res
}
}

