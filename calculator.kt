import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    println("Enter your first value: ")
    val x = scanner.nextInt()
    println("Enter your second value: ")
    val y = scanner.nextInt()

    val ans = operation(x,y)

    println("Your answer is: $ans")
}

fun operation(a:Int, b:Int):Any{
    println("Press\n " +
            "+ for addition\n " +
            "/ for division\n " +
            "- for subtraction\n " +
            "* for multiplication " +
            ": ")

    val reb = Scanner(System.`in`)
    val op = reb.nextLine()
    val answer: Any = when {
        (op == "+") -> sum(a,b)
        (op == "/") -> division(a,b)
        (op == "-") -> subtract(a,b)
        (op == "*") -> multiply(a,b)
        else        -> "Invalid"
    }
    return answer
}

fun sum(x:Int,y:Int):Int{
    val sumNumber = x+y
    return sumNumber
}

fun subtract(x:Int,y:Int):Int{
    val subtractNumber = x-y
    return subtractNumber
}

fun multiply(x:Int,y:Int):Int{
    val multiplyNumber = x*y
    return multiplyNumber
}

fun division(x:Int,y:Int):Int{
    if(y>x){
        println("Error")
    }
    else{
    val divisionNumber = x/y
    return divisionNumber
        }
    return 404
}