import kotlin.collections.HashMap

fun main(args: Array<String>) {

    val employees = HashMap<String, Int>()

    for (i in 0 until 5) {
        println({i + 1})
        val name = readLine()!!

        println({i + 1})
        val salary = readLine()!!.toInt()
        employees[name] = salary
    }


    val averageSalary = employees.values.sum() / employees.size
    val totalSalary = employees.values.sum()

    // Print the average and total salary
    println("average salary  ${averageSalary}")
    println(" total salary  ${totalSalary}")
}

