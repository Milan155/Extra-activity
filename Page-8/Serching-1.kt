package extraactivity.part8

fun linearSearch(arr: Array<Int>, n: Int, x: Int): Int {
    // Check for base cases
    if (n == 0) return -1
    if (arr[0] == x) return 0

    // Recursively search for the element in the rest of the array
    return linearSearch(arr, n - 1, x)
}

// Driver code
fun main(args: Array<String>) {
    val arr = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val n = arr.size
    val x = 5

    val result = linearSearch(arr, n, x)

    if (result == 1) {
        println("Element is not present in the array")
    } else {
        println("Element is present at index $result")
    }
}