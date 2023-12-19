package extraactivity.part6

fun main(args: Array<String>) {

    // Create an array of integers
    val myArray = arrayOf(1, 2, 3, 4, 5)

    // Get the index of the element you want to remove
    val indexToRemove = 2

    // Remove the element at the specified index
    myArray.drop(indexToRemove)

    // Print the updated array
    println(myArray.joinToString())

}