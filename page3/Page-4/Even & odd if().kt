package extraactivity.part4

import java.util.Scanner

fun main()
{
    val reader=Scanner(System.`in`)
    print("Enter your number: ")
    val num= reader.nextInt()
    if (num % 2 ==0)
        println("$num is even")
    else
        println(
            println("$num is odd"))
}