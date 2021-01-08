package generics

class Box<T> {
    var content: T? = null
    fun put(content: T?) {
        this.content = content
    }

    fun retrieve(): T? {
        return this.content
    }

    fun isEmpty(): Boolean {
        return content == null

    }
}

fun main() {
    val box = Box<Int>()
    box.put(1)
    println(box.retrieve())
    println(box.isEmpty())
    val sBox = Box<String>()
    sBox.put("Cat")
    println(sBox.retrieve())
    println(sBox.isEmpty())
}