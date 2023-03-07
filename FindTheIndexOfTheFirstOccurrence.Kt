class Solution {
    fun strStr(haystack: String, needle: String): Int {
       if(haystack.indexOf(needle.toCharArray()[0])<0){
            return -1
        } else {
            for (i in haystack.indices){
                if(i+needle.length <= haystack.length){
                    if(haystack.substring(i, i+ needle.length)==needle){
                        return i
                    }
                }
            }
        }
        return -1
}
}
