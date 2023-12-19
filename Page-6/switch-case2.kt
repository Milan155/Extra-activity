package extraactivity.part6

import java.util.*


fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // Get the two numbers from the user
    println("Enter the first number:")
    val firstNumber = scanner.nextInt()
    println("Enter the second number:")
    val secondNumber = scanner.nextInt()

    // Get the operation from the user
    println("Enter the operation (+, -, *, /):")
    val operation = scanner.next()

    // Calculate the result
    var result = 0
    when (operation) {
        "+" -> result = firstNumber + secondNumber
        "-" -> result = firstNumber - secondNumber
        "*" -> result = firstNumber * secondNumber
        "/" -> result = firstNumber / secondNumber
        else -> {
            println("Invalid operation")
            return
        }
    }
}

