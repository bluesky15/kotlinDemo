package foo

fun main() {
    println(RemoveBrackets(""))
}

fun RemoveBrackets(str: String): Int {
    var list = mutableListOf<Any>()
    str.toCharArray().forEach { c ->
        if (list.isEmpty()) {
            list.add(c)
        } else {
            if (list[list.size - 1].equals(c)) {
                list.add(c)
            } else {
                list.removeAt(list.size-1)
            }
        }
    }
    return list.size
}
