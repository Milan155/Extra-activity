package extraactivity.part2

fun main(args: Array<String>) {
    println("Enter a week number: ")
    val weekNumber = readLine()?.toInt() ?: 0
    val dayOfWeek = when (weekNumber) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid week number"
    }
    println("The day of the week is $dayOfWeek")
}