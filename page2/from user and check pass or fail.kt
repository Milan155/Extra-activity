package extraactivity.part2

fun main(args: Array<String>) {
    // Get the marks from the user
    print("Enter your marks: ")
    val marks = readLine()!!.toInt()

    // Check if the user has passed or failed
    if (marks >= 50) {
        println("You have passed!")
    } else {
        println("You have failed.")
    }
}