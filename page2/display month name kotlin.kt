package extraactivity.part2

fun main(args: Array<String>) {
    print("Enter a month number: ")
    val monthNumber = readLine()?.toInt() ?: 1

    val monthNames = arrayOf(
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    )

    println(" month name is ${monthNames[monthNumber - 1]}")
}