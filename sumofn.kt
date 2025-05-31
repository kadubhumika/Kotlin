fun main() {
    print("Enter n value: ")
    val n = readLine()?.toInt() ?: 0
    println("n value is: $n")
    
    val result = Sum(n)
    println("Sum of all 0 to n number is: $result")
}

fun Sum(n: Int): Int {
    var sum = 0
    for (i in 0..n) {
        sum += i
    }
    return sum
}
