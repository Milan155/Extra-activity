package extraactivity.part1

    fun main() {
        println("Enter annual salary -> ")
        var salary:Double = readln()!!.toDouble()

        println("Enter policy year ->  ")
        var term:Int = readln()!!.toInt()
                                    //yearly
        var month = salary /(term * 12)
                                    //3month quarterly
        var month1 = salary / (term * 3)
                                    //9month quarterly
        var month2 = salary / (term * 9)

        println(month)
        println(month1)
        println(month2)



    }

