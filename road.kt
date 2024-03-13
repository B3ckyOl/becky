import java.util.Scanner

var x = "road1"
var y = "road2"
fun main(){
    val scanner = Scanner(System.`in`)
    println("What road: ")
    val road1 = scanner.nextLine()

    println("How many cars are available on $x: ")
    val road1car = scanner.nextInt()
   val a = scanner.nextLine()

    println("What road: ")
    val road2 =  scanner.nextLine()

    println("How many cars are available on $y: ")
    val road2car = scanner.nextInt()

    println("road that is passed is: $x")
    val rebe = road(road1,road1car  )
    println(rebe)

    println("road that is passed is: $x")
    val meso = road(road2,road2car  )
    println(meso)
}

fun road(roadtype:String, car:Int):Int {
    if (car > 0) {
        "go"
    } else {
       "stop"
    }
    return 0
}





