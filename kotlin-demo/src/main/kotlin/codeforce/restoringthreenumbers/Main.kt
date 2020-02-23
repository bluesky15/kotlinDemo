package codeforce.restoringthreenumbers

import java.util.*

fun restoreThreeNumbers(ar: Array<Int>) {
    var sum = ar[0]
    for (i in ar) {
        if (i > sum) {
            sum = i
        }
    }
    ar.filter { e -> e < sum }.map { e -> sum - e }.toTypedArray().forEach { i -> print("$i ") }
}

fun main() {
    val scan = Scanner(System.`in`)
    val ar = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    val result = restoreThreeNumbers(ar)
}