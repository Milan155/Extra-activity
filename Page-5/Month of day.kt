package extraactivity.part5

import java.util.*

fun main(args: Array<String>) {
    // Get the day name from the user
    print("Enter the day name: ")
    val dayName = readLine()!!

    // Get the current date
    val today = Calendar.getInstance()

    // Get the day of the week for the current date
    val dayOfWeek = today.get(Calendar.DAY_OF_WEEK)

    // Get the number of days in the current month
    val daysInMonth = today.getActualMaximum(Calendar.DAY_OF_MONTH)

    // Create a calendar for the specified day name
    val calendar = Calendar.getInstance()
    calendar.set(Calendar.DAY_OF_WEEK, dayOfWeek)

    // Print the calendar
    println("Calendar for $dayName")
    println("----------------")
    for (i in 1..daysInMonth) {
        println(calendar.get(Calendar.DATE))
        calendar.add(Calendar.DATE, 1)
    }
}