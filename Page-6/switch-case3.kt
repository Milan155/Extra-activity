package extraactivity.part6


fun main(args: Array<String>) {
    // Get the student's score
    print("Enter your score: ")
    val score = readLine()!!.toInt()

    // Find the grade
    var grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        else -> "F"
    }

    // Print the grade
    println("Your grade is $grade")
}
