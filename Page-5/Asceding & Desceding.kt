package extraactivity.part5

fun main(args: Array<String>) {
    val array = arrayOf(10, 5, 3, 2, 1)

    // Sort the array in ascending order
    array.sort()

    // Print the sorted array
    for (element in array) {
        print(element)
    }

    println()

    // Sort the array in descending order
    array.sortDescending()

    // Print the sorted array
    for (element in array) {
        print(element)
    }
}