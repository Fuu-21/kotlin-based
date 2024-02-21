fun main(args: Array<String>) {
    val text: String? = "Helllo"
    text = null
    if (text != null ){
        println(text.length)
    }
    else{
        println("The variable is null. ")
    }
}