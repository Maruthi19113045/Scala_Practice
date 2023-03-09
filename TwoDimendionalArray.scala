object TwoDimendionalArray {
  def main(args: Array[String]): Unit = {
    val arr = Array(Array(1, 2, 3, 4),
      Array(3, 4, 5, 6),
      Array(7, 8, 9, 10),
      Array(11, 12, 13, 14))

    for (i <- 0 until 4) {
      for (j <- 0 until 4) {
        print(arr(i)(j) + " ")
      }
      println()
    }
  }
}



