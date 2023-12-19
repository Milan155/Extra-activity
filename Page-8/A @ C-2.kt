package extraactivity.part8

fun selectionSort(array: IntArray) {
    val n = array.size

    for (i in 0 until n - 1) {
        var minIndex = i

        for (j in i + 1 until n) {
            if (array[j] < array[minIndex]) {
                minIndex = j
            }
        }

        if (minIndex != i) {
            val temp = array[i]
            array[i] = array[minIndex]
            array[minIndex] = temp
        }
    }
}

fun main() {
    val numbers = intArrayOf(10, 5, 8, 20, 13)

    println("Original Array: ${numbers.joinToString(", ")}")
    selectionSort(numbers)
    println("Sorted Array (Ascending Order): ${numbers.joinToString(", ")}")
}