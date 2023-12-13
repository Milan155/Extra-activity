package extraactivity.part4

fun main(args: Array<String>) {
    val n1 = 88
    val n2 = 155
    var gcd = 1

    var i = 1
    while (i <= n1 && i <= n2) {
        // Checks if i is factor of both integers
        if (n1 % i == 0 && n2 % i == 0)
            gcd = i
        ++i
    }

    println("G.C.D of $n1 and $n2 is $gcd")
}