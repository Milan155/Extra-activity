
fun main(args: Array<String>) {
    // Get the input month number
    print("Enter the month number: ")
    val monthNumber = readLine()?.toInt() ?: 0

    // Print the number of days in the month
    when (monthNumber) {
        1, 3, 5, 7, 8, 10, 12 -> println("$monthNumber has 31 days")
        2 -> {
            // Check if the year is a leap year
            print("Is it a leap year? (y/n): ")
            val isLeapYear = readLine()?.toLowerCase() == "y"

            if (isLeapYear) {
                println("$monthNumber has 29 days")
            } else {
                println("$monthNumber has 28 days")
            }
        }
        4, 6, 9, 11 -> println("$monthNumber has 30 days")
        else -> println("$monthNumber is an invalid month")
    }
}