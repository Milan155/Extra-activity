package extraactivity.part4

fun main(args: Array<String>) {
    // Get the number from the user
    print("Enter a number: ")
    val number = readLine()!!.toInt()

    // Initialize the variables
    var i = 1
    var product: Int

    // While i is less than or equal to 10, print the multiplication table
    while (i <= 10) {
        product = number * i
        println("$number * $i = $product")
        i++
    }
}