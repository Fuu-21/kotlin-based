/*fun main(args: Array<String>) {
    println(triple(3))
}
//fun double(num: Int):Int{
  //  return num*2
fun triple(num: Int) =num * 3
*/
fun main() {
    println(getMax(11.5, 14.35))
}
fun getMax(a:Int, b: Int) =if (a > b) a else b
fun getMax(a:Double, b: Double): Double =if (a > b) a else b