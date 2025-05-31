
//function to check volvels and consonants
fun main() {
    print("Enter String: ")
    val input = readLine()!!.toLowerCase()
 for (char in input) {
    if (char.isLetter()) {
            if (isVowel(char)) {
println("Yes '$char' is a vowel")
        } else {
    println("Yes '$char' is a consonant")
  }
 }
 }
}

fun isVowel(ch: Char): Boolean {
    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
}


