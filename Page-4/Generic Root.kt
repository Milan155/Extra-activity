fun main(args: Array<String>) {
    var num = 456
    var sum = 0
    while (num > 0) {
        sum += num % 10
        num /= 10
    }
    println("Generic root of $num is $sum")
}