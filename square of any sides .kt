import java.util.Scanner

fun main(){
    val scanner=Scanner(System.`in`)
    println("what is the size of your square:")
    val size =scanner.nextInt()
        for (i in 1..size) {
            for (j in 1 .. size) {
                print("*")
            }
            println()
        }
    }

