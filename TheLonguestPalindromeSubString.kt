class Solution {
    fun longestPalindrome(s: String): String {
        if (s == s.reversed()) return s
        var max = 0
        var result = ""
        val size = s.length
        var j = 0
        while (j <= size) {
            for (i in size downTo j) {
                if (i - j <= max) {
                    continue
                }
            var test = s.substring(j, i)
            if (test == test.reversed() && i - j > max) {
                max = i - j
                result = test
            }
        }
        j++
    }

    return result
    }
}
