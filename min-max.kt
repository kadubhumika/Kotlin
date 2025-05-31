fun main() {
    val array: Array<Int> = arrayOf(1, 2, 3, 10, 12, 15, 2, 0, 1, 5)
    val ab = Find(array)  // Pass array to the class

    println("Max number in array is: ${ab.Max()}")
    println("Min number in array is: ${ab.Min()}")
}

class Find(private val array: Array<Int>) {

    fun Max(): Int {
        var max = array[0]
        for (i in 0 until array.size) {
            for (j in i + 1 until array.size) {
                if (array[j] > max) {
                    max = array[j]
                }
            }
        }
        return max
    }

    fun Min(): Int {
        var min = array[0]
        for (i in 0 until array.size) {
            for (j in i + 1 until array.size) {
                if (array[j] < min) {
                    min = array[j]
                }
            }
        }
        return min
    }
}
