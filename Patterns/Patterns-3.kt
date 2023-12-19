package extraactivity.Patterns

fun main(){


    println(" enter the triengle size:  ")
    var n = readln().toInt()


    for (i in 1..n) {
        // Print leading spaces
        for (j in 1..(n - i)) {
            print(" ")
        }

        // Print characters to convert in pattern
        for (j in 1..i) {
            if (i%2 ==0)
            {
                //  print("")
            }
            else {
                print(" *")
            }
        }
        // Go to next line
        println()
    }

    for ( k in 1..n-2)
    {
        print(" ")
    }
    print("| | |")


}