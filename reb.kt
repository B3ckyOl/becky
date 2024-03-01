import java.util.Scanner
var scanner = Scanner(System.`in`)
var reb = Scanner(System.`in`)
fun main() {
    print("enter first number: ")
    var a = scanner.nextInt()
    rebCheck(a)

    print("enter second number: ")
    var b = scanner.nextInt()
    rebCheck(b)

    print("enter arithmetic: ")
    val c = reb.nextLine()
    rebCheck(c)



    print("Answer: ")
    when{
        ( c == "+") -> {println(a + b)}
        ( c == "-") -> {println(a - b)}
        ( c == "/") -> {println(a / b)}
        ( c == "*") -> {println(a * b)}
        else        -> {println("Mathematical Error")}
    }
}


fun rebCheck(x:Any){
    if(x is Int) {
        var x = scanner.nextInt()
        while (x < 0) {
            print("Must be a positive number, enter again: ")
            x = scanner.nextInt()
        }
    }
    else{
        var x = scanner.nextLine()
        while (x != "+"|| x != "-" || x != "/" || x != "*") {
            print("Must be +,/,*,- ")
            x = scanner.nextLine()
        }
    }
}
