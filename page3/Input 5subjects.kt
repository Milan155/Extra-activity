package part3

fun main()
{

    println("Enter the marks of students in five subject")
    val physis= readln().toInt()
    val chemistry= readln().toInt()
    val biology= readln().toInt()
    val mathematics= readln().toInt()
    val computer= readln().toInt()

    val total=physis+chemistry+biology+mathematics+computer

    var percentage=(total/500) *100

    var grade:String
    if (percentage >=90)
        grade="A"
    if (percentage >=80)
        grade="B"
    if (percentage >=70)
        grade="C"
    if (percentage >=60)
        grade="D"
    if (percentage >=50)
        grade="E"
    else
    {
        grade="G"
    }
    println(percentage)
    println(grade)






}