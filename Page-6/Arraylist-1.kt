package extraactivity.part6

fun main(args: Array<String>) {
    val array = arrayOf(1, 2, 3, 4, 5, 1, 2)
    val set = array.toSet()
    val distinctArray = set.toTypedArray()
    println(distinctArray.contentToString())
}