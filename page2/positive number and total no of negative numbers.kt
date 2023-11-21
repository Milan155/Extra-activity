

fun main(args: Array<String>) {
    var totalPositiveNumbers = 0
    var totalNegativeNumbers = 0
    var numbers = arrayOf(1, -2, 3, -4, 5)

    for (number in numbers) {
        if (number > 0) {
            totalPositiveNumbers++
        } else {
            totalNegativeNumbers++
        }
    }

    println("The total number of positive numbers is $totalPositiveNumbers")
    println("The total number of negative numbers is $totalNegativeNumbers")
}