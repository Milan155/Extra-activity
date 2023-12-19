package extraactivity.part6

import java.util.*

fun main(args: Array<String>) {
    // Get the day of the week as an integer from the user
    print("Enter a day number (1-7): ")
    val dayNumber = readLine()!!.toInt()

    // Use a switch statement to print the day of the week name
    when (dayNumber) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid day number")
    }
}