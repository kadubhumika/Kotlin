fun main() {
    while (true) {
        println("Enter Customer Name : ")
        val name = readln()

        println("Enter amount of spoon sugar needed : ")
        val sugarCount = readln().toInt()

        makecoffee(sugarCount, name)
    }
}

fun makecoffee(sugarCount: Int, name: String) {
    if (sugarCount == 1) {
        println("Make Coffee for $name with $sugarCount spoon of sugar")
    } else {
        println("Make Coffee for $name with $sugarCount spoons of sugar")
    }
}
