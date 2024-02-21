fun main(args: Array<String>) {
    val alarm = 7
    when (alarm){ //using the argument alarm is asked the code runs
        12, 7, 14 -> println("Time is $alarm")
        in 1..10 -> println("The number is in the range 1..10") //in is used to check if the number is in certain range
        else -> println("Time is $alarm")
    }
}