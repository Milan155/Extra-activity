package extraactivity.part7

fun main(args: Array<String>) {
    val low = 2
    val high = 100
    for (i in low..high) {
        var isPrime = true
        for (j in 2 until i) {
            if (i % j == 0) {
                isPrime = false
                break
            }
        }
        if (isPrime) {
            println(i)
        }
    }
}