import scala.io.StdIn.readInt

object OddNumber {
  def main(args: Array[String]): Unit = {
    println("Enter the lower limit value: ")
    val lower_limit= readInt()
    println("Enter the upper limit value: ")
    val upper_limit= readInt()
    for (i <- lower_limit to upper_limit if i % 2 != 0 && i % 7 != 0) {
      println(i)
    }
  }
}
