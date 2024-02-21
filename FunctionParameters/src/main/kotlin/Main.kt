fun main() {
    greet("Caffeine", 5)
}
fun greet(name: String, reps: Int) {

    var repsLeft = reps
    while (repsLeft > 0) {
        println("hello $name! Nice to meet you!!")
        repsLeft--
    }
}