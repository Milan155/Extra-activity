package extraactivity.part8

fun main(args: Array<String>) {
    val arr = arrayOf(1, 3, 5, 7, 9, 11, 13, 15)
    val x = 5
    val result = binarySearch(arr, x)

    if (result == -1) {
        println("Element is not present in the array")
    } else {
        println("Element is present at index $result")
    }
}

fun binarySearch(arr: Array<Int>, x: Int): Int {
    var low = 0
    var high = arr.size - 1
    while (low <= high) {
        val mid = (low + high) / 2

        if (arr[mid] == x) {
            return mid
        } else if (arr[mid] < x) {
            low = mid + 1
        } else {
            high = mid - 1
        }
    }

    return -1
}