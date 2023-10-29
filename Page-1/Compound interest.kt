package extraactivity.part1

fun main()
{

    println("Enter  value1 -> ")
    //principalamount
    var one:Double = readln()!!.toDouble()

    println("Enter value2 ->  ")
    //interest
    var two:Double = readln()!!.toDouble()

    println("Enter value3 ->  ")
    //time
    var three:Double = readln()!!.toDouble()

    var result =  one* (1 + two / 100) * three - one
    println(result)


}