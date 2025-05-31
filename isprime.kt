import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter n value: ")
    val n = scanner.nextInt()

    print("Final prime numbers are: ")
    for (i in 2..n) {
        if (isPrime(i)) {
            print("$i ")
        }
    }
}

fun isPrime(num: Int): Boolean {
    if (num < 2) return false
    for (i in 2 until num) { 
        if (num % i == 0) {
            return false
        }
    }
    return true
}

