package extraactivity.part8

fun heapSort(arr: IntArray) {
    // Build a max heap
    for (i in arr.indices.reversed()) {
        heapify(arr, i, arr.size)
    }

    // Sort the array
    for (i in arr.indices.reversed()) {
        val temp = arr[0]
        arr[0] = arr[i]
        arr[i] = temp
        heapify(arr, 0, i)
    }
}

fun heapify(arr: IntArray, i: Int, n: Int) {
    // Find the largest element between the current node and its children
    var largest = i
    val left = 2 * i + 1
    val right = 2 * i + 2

    if (left < n && arr[left] > arr[largest]) {
        largest = left
    }

    if (right < n && arr[right] > arr[largest]) {
        largest = right
    }

    // If the largest element is not the current node, swap them and heapify the subtree
    if (largest != i) {
        val temp = arr[i]
        arr[i] = arr[largest]
        arr[largest] = temp
        heapify(arr, largest, n)
    }
}

fun main(args: Array<String>) {
    val arr = intArrayOf(12, 11, 13, 5, 6, 7)

    heapSort(arr)

    for (i in arr.indices) {
        print(arr[i])
    }
}