package extraactivity.part1

fun main()
{
    println("Enter full name in this format (first middle last): ")
    val fullName = readLine()!!.split(" ")

    val county1 = "India"
    val county2 = "Nepal"
    val county3 = "Shreelanka"

    println("Abbreviated name is $county1 + $county2 + $county3")
}
