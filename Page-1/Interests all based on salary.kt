fun main() {


    //enter salary
    println("Salary:: ")
    var salary:Double = readLine()!!.toDouble()

    //loan interest
    println("Loan Installment % :: ")
    var loan:Float = readLine()!!.toFloat()

    ////ex.15000*10%
    println("Enter Premium % :: ")
    var premium:Float = readLine()!!.toFloat()
    //ex.15000*10%

    var installment = (salary * loan) / 100
    println(installment)

    var insurance = (salary * premium) / 100
    println(insurance)

    var gross = salary - installment - insurance
    println(gross)
}
