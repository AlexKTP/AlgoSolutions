import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maxArea(height: IntArray): Int {
      var max = 0
    first@for (i in height.indices) {
        if(height[i] * (height.size-1 - i)<max) continue@first
        second@for (j in height.size-1 downTo i+1) {
            val one = height[i]
            val two = height[j]
            val heigher = min(one, two)
            val diff = j - i
            val r = heigher*diff
            if(r<max) continue@second
            max = max(r, max)

        }
    }
    return max
    }
}
