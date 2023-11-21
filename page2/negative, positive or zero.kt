package extraactivity.part2

fun main(args: Array<String>) {
    val number = 12.3
    when (number) {
        in Double.NEGATIVE_INFINITY..0.0 -> println("$number is a negative number.")
        in 0.0..Double.POSITIVE_INFINITY -> println("$number is a positive number.")
        else -> println("$number is 0.")
    }
}