object FactorialRecursion {
    def factorial(n: Int): Int = {
      if (n == 0)
        return 1
      else
        return n * factorial(n - 1)
    }
    def main(args: Array[String]) {
      println(factorial(6))
    }
}
