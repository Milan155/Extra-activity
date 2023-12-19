package extraactivity.part8

fun main(args: Array<String>) {
    val str1 = "Hello"
    val str2 = "Hello"

    val str1Ptr = str1.toCharArray()
    val str2Ptr = str2.toCharArray()

    var i = 0
    while (i < str1Ptr.size) {
        if (str1Ptr[i] != str2Ptr[i]) {
            println("Strings are not equal")
            return
        }

        i++
    }

    println("Strings are equal")
}