package foo

fun main() {
    println(nonrepeting("hello world hi hey"))


}

fun nonrepeting(s: String): Any? {
    var map = mutableMapOf<Char, Int>()
    var cc = s.toCharArray().forEach { ch ->
        if (map.get(ch) == null) {
            map.put(ch, 1)
        } else {
            map.put(ch, (map.get(ch)!! + 1))
        }
    }
    map.entries.forEach { c -> if(c.value ==1) return c.key.toString() }
    return ""
}
