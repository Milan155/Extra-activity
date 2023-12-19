package extraactivity.part7

class `Decimal or binary-4`fun main(args: Array<String>) {
    val num = 51
    var flag = false
    for (i in 2..num / 2) {
        // condition for nonprime number
        if (num % i == 0) {
            flag = true
            break
        }
    }

    if (!flag)
        println("$num is a prime number.")
    else
        println("$num is not a prime number.")
}