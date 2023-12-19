package extraactivity.part7
fun main(args: Array<String>) {
    val str = "123"
    var num = 0
    for (i in str.indices) {
        num = num * 10 + Character.getNumericValue(str[i])
    }
    println(num)
}