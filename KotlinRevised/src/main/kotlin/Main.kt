fun main() {
    /* val userName: String = "Caffeine" //grey bhaneko kotlin lai pailai thacha kun bhanera remove garda huncha
    var age: Int = 20
    Int
    println("Hello, My name is $userName. My age is $age. In 2 years I will be ${age+2}.") //$username nai print garnu cha bhane \ use garne

    val exampleString = "Caffeine"
    val exampleNumber = 20L // float lai F exponential lai e and many more
    val exampleLong: Long = exampleNumber.toLong()

    val exampleChar = 'a' //string lai "" ani char lai ''
    */

    /*var a = 4
    val b = 3
    println("a = $a, b = $b")
    //println(result)
    println("a + b = ${a + b}")
    println("a - b = ${a - b}")
    println("a / b = ${a / b}")
    println("a * b = ${a * b}")
*/
    val names = arrayOf("Jim", "John", "Jenny")
    val numbers = arrayOf(arrayOf(1,2,3), arrayOf(3,4,5), arrayOf(6,7,8))

    println(numbers[1][1])
    names[0] = "Jeremy" //val le names lai matra lagu huncha aaru lai hudaina
    println(names[0][2])
    println(names[0].length)
    print("Number of elements: ${names.size}\n")
    println("First element: ${names[0]}")

}