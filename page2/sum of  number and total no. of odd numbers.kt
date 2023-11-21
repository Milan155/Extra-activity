package extraactivity.part2

fun main(args: Array<String>) {
    val arr = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    var evenSum = 0
    var oddCount = 0

    for (i in arr.indices) {
        if (arr[i] % 2 == 0) {
            evenSum += arr[i]
        } else {
            oddCount++
        }
    }


    println("The total sum of even numbers is: $evenSum")
    println("The total number of odd numbers is: $oddCount")
}