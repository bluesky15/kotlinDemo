package codeforce.removeduplicates

import java.util.*
import kotlin.collections.ArrayList


fun removeDuplicates(n: Int, ar: ArrayList<Int>) {
    val it = ar.iterator()
    print(ar)
}

fun main() {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    val ar = scan.nextLine().split(" ").map { it.trim().toInt() }.toCollection(ArrayList())
    removeDuplicates(n, ar)

}
