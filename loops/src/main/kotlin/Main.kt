fun main() {
    val names = arrayOf("Jim", "John", "Jenny", "Jamie")
/*
    for(name: String in names){
        println(name)
    }

    for(i in 1..10){ //1..10
    }
    for(i in 1 until 10){//1 until 10
        println(i)
    }
    for(i in 10 downTo  1){//10 downTo 1
        println(i)
    }
    for(i in 1..10){
        println(i)
    }
*/
    //names.indices

    for (index: Int in names.indices){
        println("Index: $index .: ${names[index]}")
    }
}