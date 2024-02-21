fun main(args: Array<String>) {
    var x = 5
    val y = 3
    val result = x + y
    println("The result is $result")
    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
    println("x % y = ${x % y}")

    var resultNew = x + y
    resultNew = resultNew + 2

    println("result = $resultNew")

    println("3 + 3 * 4 =${(3 + 3) * 4}")

    x = 0
    println("x = ${x++}") // returns the value of 0 but has the value of 1
    println("x = ${++x}") // increments the value of 1 and returns 2

    println("x = ${x--}") //has the value 2 but has value 1
    println("x = ${--x}") //decrements the value 1 and returns  the value 0
//else if
    val isActive = false
    if (isActive == true) {
        println("The user is active")
    } else {
        print("The user is inactive\n")
    }
//greater than
    val myNumber = 90
    if (myNumber > 150) {
        println("Greater than 100")
    } else if (myNumber == 100) {
        println("Equal to 100")
    } else {
        println("Lesser than 100\n")
    }
//Logical and operator
    val isPlaying = true
    val score = 80
    if (isPlaying && score == 100) {
        println("Next level opened")
    } else {
        println("Still at the same level")
    }


//logical or operator

    val num1 = 5
    val num2 = -3
    if (num1 > 0 || num2 > 0) {
        println("True")
    } else {
        println("False")
    }
}