object placeholder {
  def main(args: Array[String]) = {


    val a = 10
    val b = 20
    val v1 = testM(_+_, a, b, 30.0)
    println(s"===>$v1")
  }

  def testM(highFunction: (Int, Int) => Int, a: Int, b: Int, d: Double): Double = {


    highFunction(a, b) * d
  }
}
