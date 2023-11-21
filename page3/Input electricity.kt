package part3

fun main(args: Array<String>) {
    println("Enter the number of units consumed:")
    val units = readLine()?.toIntOrNull() ?: 0

    var billAmount = 0.0

    if (units <= 50) {
        billAmount = units * 0.50
    } else if (units <= 100) {
        billAmount = units * 0.75
    } else if (units <= 100) {
        billAmount = units * 1.20
    }
    else if (units <= 250) {
        billAmount = units * 1.50
    }
    else
    {
        billAmount = 50 * 0.50 + 100 * 0.75 + (units - 100) * 1.20 + 250 * 1.50
    }

    println("Total electricity bill: Rs. $billAmount")
}


