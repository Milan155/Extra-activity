package extraactivity.part8

import java.io.FileReader
import java.io.File
import java.io.IOException

fun main(args: Array<String>) {
    val file = File("\"C:\\Users\\Milan\\OneDrive\\Desktop\\sha-1.txt")
    val process = Runtime.getRuntime().exec(file.absolutePath)
    process.waitFor()
}