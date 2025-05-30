fun main() {
    val nums: List<Int> = listOf(1, 2, 3, 4, 5, 5, 6, 6, 7, 8, 8)
    val uniqueList = mutableListOf<Int>()

    for (i in 0 until nums.size) {
        var isDuplicate = false
        for (j in 0 until uniqueList.size) {
            if (nums[i] == uniqueList[j]) {
                isDuplicate = true
                break
            }
        }
        if (!isDuplicate) {
            uniqueList.add(nums[i])
        }
    }

    println("Original List: $nums")
    println("List after removing duplicates: $uniqueList")
}
