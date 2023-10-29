package extraactivity.part2

fun main(args: Array<String>) {
    print("Enter the first number: ")
    val firstNumber = readLine()!!.toInt()
    print("Enter the second number: ")
    val secondNumber = readLine()!!.toInt()
    val sum = firstNumber + secondNumber
    println("two numbers is $sum")
}
