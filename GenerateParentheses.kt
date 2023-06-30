class Solution {
    fun generateParenthesis(n: Int): List<String> {
        var res = mutableSetOf<String>()
        dfs(n, n, "", res)
        return res.toList()
    }

    fun dfs(l: Int, r:Int, s:String, res:MutableSet<String>){
        if(l>r) return
        if(l == 0 && r == 0){
            res.add(s)
            return
        } else {
            if(l>0)dfs(l-1, r, s+"(", res)
            if(r>0)dfs(l, r-1, s+")", res)
        }

    }
}