package codeforce.filenamexx

import java.util.*

fun removeX(n: Int, str: String) {
    if (n !in 3..100) {
        return
    }
    val regx1 = "^xxx".toRegex()
    val regx2 = "xxx".toRegex()
    var count = 0
    var temp = str
    var isTrue = true;
    while (isTrue) {
        when {
            regx1.containsMatchIn(temp) -> {
                temp = temp.removePrefix("x")
                count++
            }
            regx2.containsMatchIn(temp) -> {
                temp = temp.replaceFirst("xxx", "xx")
                count++
            }
            else -> {
                isTrue = false
            }
        }
    }
    print(count)

}

fun main() {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    val str = scan.nextLine().trim().toString()
    removeX(n, str)

}
