fun main() {
    val odd: List<Int> = listOf(1, 3, 5, 7, 9)
    val even: List<Int> = listOf(2, 4, 6, 8, 0)
    val prime: List<Int> = listOf(2, 3, 5, 7, 11)

    // Create a list of all input arrays
    val allArrays = listOf(odd, even, prime)

    val finalMerged = merge(allArrays)

    println("Merged Array:")
    for (element in finalMerged) {
        print("$element ")
    }

    val uniqueList = finalMerged.distinct()

    println("\nAfter Removing Duplicates, Final Array: $uniqueList")
}

fun merge(arrays: List<List<Int>>): List<Int> {
    val result = mutableListOf<Int>()
    for (array in arrays) {
        for (element in array) {
            result.add(element)
        }
    }
    return result
}
