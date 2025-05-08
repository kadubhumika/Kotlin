import java.util.scanner
fun main(){
val scanner = Scanner(System.in)
val n = scanner.nextDouble()

val result = fibonaci(n)
println("Fibbonaci number is $result")
}

fun fibonaci(n:Int):Int{
return if(n==1){
1
}
else if (n==0){
0
}
else fibonaci(n-1)+fibonaci(n-2)
}
