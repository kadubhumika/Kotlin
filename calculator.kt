import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Welcome to Basic Calculator!")

    while (true) {
        println("\nSelect Operation:")
        println("1. Addition (+)")
        println("2. Subtraction (-)")
        println("3. Multiplication (*)")
        println("4. Division (/)")
        println("5. Exit")

        print("Enter your choice: ")
        when (scanner.nextInt()) {
            1 -> performOperation(scanner, "+")
            2 -> performOperation(scanner, "-")
            3 -> performOperation(scanner, "*")
            4 -> performOperation(scanner, "/")
            5 -> {
                println("Exiting Calculator. Goodbye!")
                break
            }
            else -> println("Invalid choice. Please try again.")
        }
    }
}

fun performOperation(scanner: Scanner, operator: String) {
    print("Enter first number: ")
    val num1 = scanner.nextDouble()

    print("Enter second number: ")
    val num2 = scanner.nextDouble()

    val result = when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> if (num2 != 0.0) num1 / num2 else "Undefined (division by zero)"
        else -> "Invalid operation"
    }

    println("Result: $result")
}
