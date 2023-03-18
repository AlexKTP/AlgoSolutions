class Solution {
    fun reverse(x: Int): Int {
         var coeff = 1
         if(x<0) coeff = -1
         val temp = 
         Math.abs(x).toString().reversed().toIntOrNull() ?: return 
0
         return temp*coeff
    }
}
