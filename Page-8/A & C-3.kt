package extraactivity.part8

fun mergeSort(array: Array<Int>): Array<Int> {
    if (array.size <= 1) {
        return array
    }

    val mid = array.size / 2
    val left = mergeSort(array.copyOfRange(0, mid))
    val right = mergeSort(array.copyOfRange(mid, array.size))

    return merge(left, right)
}

fun merge(left: Array<Int>, right: Array<Int>): Array<Int> {
    val mergedArray = Array<Int>(left.size + right.size) { 0 }
    var i = 0
    var j = 0
    var k = 0

    while (i < left.size && j < right.size) {
        if (left[i] <= right[j]) {
            mergedArray[k] = left[i]
            i++
        } else {
            mergedArray[k] = right[j]
            j++
        }
        k++
    }

    while (i < left.size) {
        mergedArray[k] = left[i]
        i++
        k++
    }

    while (j < right.size) {
        mergedArray[k] = right[j]
        j++
        k++
    }

    return mergedArray
}

fun main(args: Array<String>) {
    val array = arrayOf(5, 3, 2, 1, 4)
    val sortedArray = mergeSort(array)

    println("Sorted array: ${sortedArray.joinToString()}")
}