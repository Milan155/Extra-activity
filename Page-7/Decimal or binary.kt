package extraactivity.part7

fun main(args: Array<String>) {
    // Convert an octal number to a decimal number
    val octalNumber = "123"
    val decimalNumber = octalNumber.toInt(8)
    println("The decimal equivalent of $octalNumber is $decimalNumber")

    // Convert a decimal number to an octal number
    val decimalNumber2 = 123
    val octalNumber2 = decimalNumber2.toString(8)
    println("The octal equivalent of $decimalNumber2 is $octalNumber2")
}