//function to check leap year
fun main() {
    println("Enter a year:")
    val year = readLine()!!.toInt()

  if (isLeapYear(year)) {
        println("Yes! It is a leap year")
   } 
	
	else {
  println("No! It is not a leap year")
 }
}

fun isLeapYear(year: Int): Boolean {
  return if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
    true
    } 
	else {
  false
  }
}

