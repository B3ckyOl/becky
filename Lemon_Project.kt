import java.util.*

val scanner: Scanner = Scanner(System.`in`)

fun main() {
    println("Enter the day of the week:")
    val weekday = scanner.nextLine()
    println("Enter the hour of the day :")
    val hour = scanner.nextInt()

    val isOpen = when (weekday) {

        "Monday" -> hour in 8..12

        "Tuesday" -> hour in 8..12

        "Wednesday" -> hour in 8..11

        "Thursday" -> hour in 8..11

        "Friday" -> hour in 8..20

        else -> false
    }

    if (isOpen) println("Little Lemon is open now")

        else  println("Little Lemon is closed")

    }







