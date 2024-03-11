import java.util.Scanner
var scanner = Scanner(System.`in`)
var reb = Scanner(System.`in`)
fun main() {
    print("enter first number: ")
    var a = scanner.nextInt()
    a = intCheck(a)

    print("enter second number: ")
    var b = scanner.nextInt()
    b = intCheck(b) 

    print("enter arithmetic: ")
    val c = reb.nextLine()
    val arithmetic = rebCheck(c)

    
    print("Answer: ")
    when{
        ( arithmetic == "+") -> {println(a + b)}
        ( arithmetic == "-") -> {println(a - b)}
        ( arithmetic == "/") -> {println(a / b)}
        ( arithmetic == "*") -> {println(a * b)}
        else           -> {println("Mathematical Error")}
    }
}

fun rebCheck(x:String):String{
        var r = x
        while (r != "+" && r != "-" && r != "/" && r != "*")
        {
            print("Must be + or / or * or -, enter again: ")
            r = reb.nextLine()
        }
        return r
}

fun intCheck(x:Int):Int{
        var integer = x
        while (integer < 0) {
            print("Must be a positive number, enter again: ")
            integer = scanner.nextInt()
        }
        return integer
}
