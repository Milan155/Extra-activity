package extraactivity.part2

fun main(args: Array<String>) {
    print("Enter any alphabet: ")
    val alphabet = readLine()!!.toCharArray()[0]

    if (alphabet in 'a'..'z' || alphabet in 'A'..'Z') {
        if (alphabet in "aeiouAEIOU") {
            println("$alphabet is a vowel.")
        } else {
            println("$alphabet is a consonant.")
        }
    } else {
        println("$alphabet is not an alphabet.")
    }
}