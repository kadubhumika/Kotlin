fun gamePerform(person1: Char, person2: Char): Int {
    return when {
        person1 == person2 -> 0  // It's a tie
        person1 == 's' && person2 == 'p' -> 1  // Person 1 wins
        person1 == 'p' && person2 == 'r' -> 1  // Person 1 wins
        person1 == 'r' && person2 == 's' -> 1  // Person 1 wins
        else -> 2  // Person 2 wins
    }
}

fun main() {
    val scissor = 's'
    val rock = 'r'
    val paper = 'p'

    println("Some important points to note before the game starts:")
    println("Denotation of tossing Scissors = $scissor")
    println("Denotation of tossing Rock = $rock")
    println("Denotation of tossing Paper = $paper")

    // Input for person 1 and person 2
    print("Enter person1's choice (s for Scissors, r for Rock, p for Paper): ")
    val person1 = readLine()!!.first()

    print("Enter person2's choice (s for Scissors, r for Rock, p for Paper): ")
    val person2 = readLine()!!.first()

    print("Enter the number of rounds to play: ")
    val n = readLine()!!.toInt()

    var person1Wins = 0
    var person2Wins = 0
    var ties = 0

    // Play the game for 'n' rounds
    repeat(n) { round ->
        val result = gamePerform(person1, person2)
        when (result) {
            1 -> {
                person1Wins++
                println("Round ${round + 1}: Person 1 wins!")
            }
            2 -> {
                person2Wins++
                println("Round ${round + 1}: Person 2 wins!")
            }
            else -> {
                ties++
                println("Round ${round + 1}: It's a tie!")
            }
        }
    }

    // Display the final winner based on the number of wins
    when {
        person1Wins > person2Wins -> println("\nPerson 1 wins the game with $person1Wins wins!")
        person2Wins > person1Wins -> println("\nPerson 2 wins the game with $person2Wins wins!")
        else -> println("\nIt's a tie! Both players won $person1Wins rounds each.")
    }
}
