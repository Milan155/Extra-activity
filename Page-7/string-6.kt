package extraactivity.part7

fun main(args: Array<String>) {
    val input = "race"
    val reversed = input.reversed()
    if (input == reversed) {
        println("$input is a palindrome")
    } else {
        println("$input is not a palindrome")
    }
}