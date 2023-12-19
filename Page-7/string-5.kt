package extraactivity.part7

fun main(args: Array<String>) {
    val str1 = "Hello"
    val str2 = "Done"

    val result = str1.compareTo(str2)

    if (result == 0) {
        println("The strings are equal.")
    } else if (result < 0) {
        println("The first string is lexicographically smaller than the second string.")
    } else {
        println("The first string is lexicographically greater than the second string.")
    }
}