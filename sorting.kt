import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter value of n: ")
    val n = scanner.nextInt()

  
    println("Before Sorting:")
    val originalList = Original(n)
    println(originalList)

   
    val sortedResult = Sorting(originalList) { list ->

        for (i in 0 until list.size) {
            for (j in i + 1 until list.size) {
                if (list[i] > list[j]) {
                    val temp = list[i]
                    list[i] = list[j]
                    list[j] = temp
                }
            }
        }
        list 
    }

    println("After Sorting:")
    println(sortedResult)
}

fun Original(n: Int): MutableList<Int> {
    val list = mutableListOf<Int>()
    for (i in 0..n) {
        list.add(i)
    }
    return list
}

fun Sorting(
    list: MutableList<Int>,
    sortLogic: (MutableList<Int>) -> MutableList<Int>
): MutableList<Int> {
    return sortLogic(list)
}
