package extraactivity.part1

fun main(args: Array<String>) {
    val snakesize = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9)
    )

    for (i in 0 until snakesize.size) {
        if (i % 2 == 0) {
            for (j in 0 until snakesize[i].size) {
                print(snakesize[i][j])
            }
        } else {
            for (j in snakesize[i].size - 1 downTo 0) {
                print(snakesize[i][j])
            }
        }
        println()
    }
}