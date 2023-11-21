package part3

fun main(){
    // Get the basic salary of the employee
    print("Enter the basic salary of the employee: ")
    val basicSalary = readLine()!!.toDouble()

    // Calculate the HRA and DA
    var hra = 0.0
    var da = 0.0
    if (basicSalary <= 10000)
    {
        hra = basicSalary * 0.2
        da = basicSalary * 0.8
    } else if (basicSalary > 20000)
    {
        hra = basicSalary * 0.25
        da = basicSalary * 0.9
    }else if (basicSalary <= 20000)
    {
        hra = basicSalary * 0.25            
        da = basicSalary * 0.9
    }
    else {
        hra = basicSalary * 0.3
        da = basicSalary * 0.95
    }

    // Calculate the gross salary
    val grossSalary = basicSalary + hra + da

    // Print the gross salary
    println("The gross salary of the employee is: $grossSalary")
}