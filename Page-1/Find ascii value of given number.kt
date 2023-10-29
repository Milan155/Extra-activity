package extraactivity.part1

fun main() {
    val input = 's'
    println(input)
    getASCII(input)
}
fun getASCII(input: Char) {
    val myResult = input.toInt()
    println("The ASCII value of $input is: $myResult")
}
