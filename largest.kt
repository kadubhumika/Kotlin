import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextDouble()
    val b = scanner.nextDouble()
    val c = scanner.nextDouble()

    val result = Largest(a, b, c)
    println("Largest number : $result")
}

fun Largest(a: Double, b: Double, c: Double): Double {
    if (a > b && a > c) {
        return a
    } else if (b > a && b > c) {
        return b
    } else if (c > a && c > b) {
        return c
    } else {
        // if all numbers are equal
        return a // or b or c, because all are same
    }
}

