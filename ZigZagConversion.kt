class Solution {
fun convert(s: String, numRows: Int): String {
    val map = mutableMapOf<Int, StringBuilder>()
    var row = 0
    var down = false;
    s.forEach {
        if (map[row] == null) {
            map[row] = StringBuilder()
        }
        map[row]?.append(it)
        if (row == 0) down = false
        if (row == numRows - 1) down = true
        if (down) {
            row--
        } else {
            row++
        }
    }

    return map.mapKeys { it.value }.values.joinToString("")
}
}