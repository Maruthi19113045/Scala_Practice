object FabnaciSeries {
    def main(args: Array[String]) = {
      val n = 5
      for (i <- 0 to n - 1) {
        print(fibanaci(i) + " ")
      }
    }
    def fibanaci(n: Int): Int = {
      if (n == 0 || n == 1) {
        n
      } else {
        fibanaci(n - 1) + fibanaci(n - 2)
      }
    }
}
