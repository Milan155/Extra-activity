package extraactivity.part2

fun main()
{
    val char= 'A'

    if (char in 'A'..'Z') {
        println("$char  is upper case")
    }

     else if   (char in 'a'..'z') {
        println("$char  is Lower case")
    }


    else if (char in '0'..'9')
        println("$char is digit")
    else{
        println("$char is a speacial char")

}

}