package hofunction


fun main() {
    test(7) { myBlockFun(it) }
}

inline fun myBlockFun(num: Int) {
    print(num + 1)
}

fun test(count: Int, block: (num: Int) -> Unit) {
    println(count)
    block(count)
}