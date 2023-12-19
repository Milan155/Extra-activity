package extraactivity.Patterns


fun main() {

    println(" Enter the value of row : ")
    val n = readln().toInt()

    // Upper part
    for (i in 1..n) {
        for (j in 1..n-i ) {
            print(" ")
        }
        for (k in 1 until 2 * i) {
            print("*")
        }
        println()
    }

    // Lower part
    for (i in n - 1 downTo 1) {
        for (j in 1..n-i ) {
            print(" ")
        }
        for (k in 1 until 2 * i) {
            print("*")
        }
        println()
    }
}
