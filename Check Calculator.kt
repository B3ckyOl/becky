import java.util.Scanner
var scanner = Scanner(System.`in`)
var reb = Scanner(System.`in`)
fun main() {
    print("enter first number: ")
    val a = scanner.nextInt()
    rebCheck(a)

    print("enter second number: ")
    val b = scanner.nextInt()
    rebCheck(b)

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

fun rebCheck(x:Any):Any {
    if (x is Int) {
        var integer = x .toInt()
        while (integer < 0) {
            print("Must be a positive number, enter again: ")
            integer = scanner.nextInt()
        }
        return integer
    }
    else {
        var r = x
        while (r != "+" && r != "-" && r != "/" && r != "*")
        {
            print("Must be + or / or * or -, enter again: ")
            r = reb.nextLine()
        }
        return r
    }
}

