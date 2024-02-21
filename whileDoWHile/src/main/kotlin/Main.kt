fun main(args: Array<String>) {
    var i = 0
    /*while(i < 5){
        println(i)
        i++
    }*/
    do {
        println(i)
        i++

        var j = 0
        while(j < 5){
            println("---$j")
            j ++
        }
    }while(i < 5)
}