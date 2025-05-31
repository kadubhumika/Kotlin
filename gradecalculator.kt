
//function for grade calculator
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter your name: ")
    val name = scanner.nextLine()

    print("Enter your marks out of 100: ")
    val marks = scanner.nextDouble()

    println("Marks of $name is $marks")
    println("TOTAL MARKS IS 100")

    val gradeResult = Grade(marks)
    println("Grade: $gradeResult")
}
fun Grade(marks: Double): String {
    return if (marks >= 90 && marks <= 100) {
        " (KAISE PADH LETE HO ITNE WOH BHI COLLEGE LIFE MEIN!!)"
		
		
 } else if (marks >= 70 && marks < 90) {
        "C"
  } else if (marks >= 50 && marks < 70)
  {
  
        "B"
  }
  else if (marks >= 30 && marks < 50) {
        "A"
 } else if (marks < 30) {
        "A++"
    } else {
        "YOU ARE GANDU!!"
  }
}



