package codeforce.removeduplicates

import java.util.*
import kotlin.collections.ArrayList


fun removeDuplicates(n: Int, ar: ArrayList<Int>) {
    val map = mutableMapOf<Int, Int>()
    for (i in n - 1 downTo 0) {
        if (!map.containsKey(ar[i])) {
            map[ar[i]] = i
        }
    }
    println(map.size)
    map.entries.sortedBy { it.value }.forEach { print("${it.key} ") }

}

fun main() {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    val ar = scan.nextLine().split(" ").map { it.trim().toInt() }.toCollection(ArrayList())
    removeDuplicates(n, ar)

}
