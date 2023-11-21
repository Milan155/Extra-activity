package extraactivity.part2



fun main(args: Array<String>) {
    print("Enter a character: ")
    val char = readLine()!!.toCharArray()[0]

    // Check if the character is a vowel
    if (char in 'a'..'z') {
        if (char in 'a'..'u') {
            println("$char is a vowel.")
        } else {
            println("$char is a consonant.")
        }
    } else {
        println("$char is not an alphabet.")
    }
}