package extraactivity.part1

fun main()
{
    val persons = HashMap<String, Int>()

    for (i in 0 until 5) {
        println({i + 1})
        val users = readLine()!!

        println({i + 1})
        val expence = readLine()!!.toInt()
        persons[users] = expence

    }
    val totalexpence = persons.values.sum() / persons.size
    val avgexp = persons.values.sum()


    // Print the total  and average exp
    println("Total exp  ${totalexpence}")
    println("Total Avgexp  ${avgexp}")


}