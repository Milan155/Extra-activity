package extraactivity.part2


import java.util.*

//Main Function , Entry point of Program
fun main(args: Array<String>) {

    //Input Stream
    val a1 = Scanner(System.`in`)

    print("Enter temperature into Fahrenheit : ")
    val fahrenheit = a1.nextDouble()


    val celsius =( (fahrenheit  -  32  ) *  5)/9

    println("Temperature in Fahrenheit ($fahrenheit) = Celsius ($celsius)")
}
