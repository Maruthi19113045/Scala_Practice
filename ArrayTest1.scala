object ArrayTest1 {
    def main(args: Array[String]): Unit = {
      val myArr = Array.ofDim[Int](n1 = 2, n2 = 2)
      val n: Int = 2
      val myArr2 = Array(Array(1, 2, 3, 4), Array(3, 4, 5, 6))
      myArr(0)(0) = 10
      myArr(0)(1) = 20
      println(myArr(0)(0))
      for (i <- 0 until n; j <- 0 until n) {
        print(i, j)
        println("=" + myArr(i)(j))
      }
      for (i <- 0 until 2) {
        for (j <- 0 until 4) print(s" ${myArr2(i)(j)}")
        println()
      }
    }


}
