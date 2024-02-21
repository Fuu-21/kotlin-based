fun main() {
    println("2 > 1 is ${2 > 1}")
    println("2 < 1 is ${2 < 1}")
    println("2 >= 1 is ${2 > 1}")

    println("!(2 >= 1) is ${!(2 > 1)}")

    val condition:Boolean = 2 > 1 || 3 > 2 && 2 > 3
    print(condition)

}