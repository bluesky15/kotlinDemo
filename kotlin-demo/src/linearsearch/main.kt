package linearsearch

fun main() {
    var array = listOf<Int>(1, 2, 4, 3, 5, 7, 8, 66, 44, 9, 13, 14, 15, 44, 33, 32, 77, 0)
    // find 44 in this array using linear search
    array.indices.forEach { i ->
        if (array[i] == 44) {
            print("number 44 found in $i place")
        }
    }
}

