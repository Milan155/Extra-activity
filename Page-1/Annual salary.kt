package extraactivity.part1

fun main()
{
    println("Enter annual salary -> ")
    var salary:Double = readln()!!.toDouble()

    //12monthly
    println("Enter months ->  ")
    var term:Int = readln()!!.toInt()

    var yearly = salary  * term
    var quarterly = salary * 3


    println(yearly)
    println(quarterly)

}