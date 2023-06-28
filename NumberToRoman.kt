class Solution {
    fun intToRoman(num: Int): String {
        return number2roman(num, StringBuilder())
    }

    fun number2roman(num: Int, result: StringBuilder): String{
    when (num){
        in 1..3 -> {
            result.append("I")
            number2roman(num - 1, result)
        }
        4 -> {
            result.append("IV")
            number2roman(num - 4, result)
        }
        in 5..8 -> {
            result.append("V")
            number2roman(num - 5, result)
        }
        9 -> {
            result.append("IX")
            number2roman(num - 9, result)
        }
        in 10..39 -> {
            result.append("X")
            number2roman(num - 10, result)
        }
        in 40..49 -> {
            result.append("XL")
            number2roman(num - 40, result)
        }
        in 50..89 -> {
            result.append("L")
            number2roman(num - 50, result)
        }
        in 90..99 -> {
            result.append("XC")
            number2roman(num - 90, result)
        }
        in 100..399 -> {
            result.append("C")
            number2roman(num - 100, result)
        }
        in 400..499 -> {
            result.append("CD")
            number2roman(num - 400, result)
        }
        in 500..899 -> {
            result.append("D")
            number2roman(num - 500, result)
        }
        in 900..999 -> {
            result.append("CM")
            number2roman(num - 900, result)
        }
        in 1000..3999 -> {
            result.append("M")
            number2roman(num - 1000, result)
        }
        else -> {
            println(result)
            return result.toString()
        }
    }

    return result.toString()
}
}