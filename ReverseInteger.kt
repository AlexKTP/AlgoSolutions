class Solution {
    fun reverse(x: Int): Int {
        var result: Long = 0
        var absolute = Math.abs(x)
        if(absolute<0)return 0
        if(x<0) result =  absolute.toString().reversed().toLong() *-1
        else result = x.toString().reversed().toLong()
        if(result in Int.MIN_VALUE..Int.MAX_VALUE ) return result.toInt()
        else return 0
    }
}
