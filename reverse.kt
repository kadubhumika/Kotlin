
fun main() {
    print("Enter a string: ")
    val string = if(readline()!=Null) readline()!!else""
    val result = reverse(string) 
    println("Reversed string is: $result") 
}


fun reverse(string: String): String {
    var reversedString = ""  
    for (i in string.length - 1 downTo 0) {  
        reversedString += string[i]  
    }
    return reversedString
}
