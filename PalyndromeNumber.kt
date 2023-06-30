class Solution {
    fun isPalindrome(x: Int): Boolean {
        var s = x.toString()
        var result = true
         s.forEachIndexed { index, c ->
                if(index<s.length /2 &&
                 c != s.toCharArray()[s.length-1-index]) result = false
            }  
        return result
        
    }
}