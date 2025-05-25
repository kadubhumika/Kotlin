fun main() {
    val nums: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    print("Enter the element to be searched: ")
    val input = readLine()
    val element = input?.toIntOrNull() ?: 0

    println("Element to be searched in the array is: $element")

    val result = search(nums, element)
    if (result) {
        println("YES, ELEMENT FOUND")
    } else {
        println("NO, ELEMENT NOT FOUND")
    }
}

fun search(nums: List<Int>, element: Int): Boolean {
    for (i in nums.indices) {
        if (nums[i] == element) {
            return true
        }
    }
    return false
}
