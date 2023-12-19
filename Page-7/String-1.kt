package extraactivity.part7

fun main() {
    val str = "apple"
    val charToDelete = 'p'
    val resultString = str.replace(charToDelete.toString(), "")
    println(resultString)
}