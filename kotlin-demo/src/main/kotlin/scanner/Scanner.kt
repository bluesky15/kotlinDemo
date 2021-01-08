package scanner

import java.util.*
import kotlin.math.*


//fun main() {
//    val stringInput = readLine()!!
//    print("You have entered = $stringInput")
//}
// hiking selfies problem - walmart hacker rank
fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    val n: Double = reader.nextDouble()
    val x: Double = reader.nextDouble()
    val res = (2.0.pow(n) - 1) - x
    print(abs(res).toInt())
}