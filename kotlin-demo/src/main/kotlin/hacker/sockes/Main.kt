package hacker.sockes

import java.util.*
import kotlin.collections.MutableMap

// Complete the sockMerchant function below.
fun sockMerchant(n: Int, ar: Array<Int>): Int {
    var myMap: MutableMap<Int, Int> = mutableMapOf()
    var pairOfSocks = 0
    for (i in ar) {
        if (myMap[i] == 1) {
            myMap[i] = 0
            pairOfSocks += 1
        } else if (myMap[i] == null || myMap[i] == 0) {
            myMap[i] = 1
        }
    }
    return pairOfSocks
}

fun main() {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}
