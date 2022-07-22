package hacker.vallyproblem

import java.util.*

fun countingValleys(n: Int, s: String): Int {
    var position = 0
    var vallyCount = 0
    if (n < 2 || s.isEmpty()) {
        return 0
    }
    var chArray = s.toCharArray()
    chArray.forEach { c ->
        if (c == 'U') {
            position += 1
        } else {
            position -= 1
        }
        if (position == 0 && c == 'U') {
            vallyCount += 1
        }
    }
    return vallyCount
}

fun main() {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val s = scan.nextLine()

    val result = countingValleys(n, s)

    println(result)
}