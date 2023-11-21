package extraactivity.part2

fun main(args: Array<String>) {
  val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  var evenCount = 0
  var oddCount = 0

  for (number in numbers) {
    if (number % 2 == 0) {
      evenCount++
    } else {
      oddCount++
    }
  }

  println("The number of even numbers is $evenCount")
  println("The number of odd numbers is $oddCount")
}