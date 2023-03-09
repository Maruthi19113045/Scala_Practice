object foreach2 {
    def main(args: Array[String]): Unit = {
      var v = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
      v.foreach(n => {
        if (n == 5) {
          println("FIVE")
        }
        else {
          println(n)
        }
      }
      )
    }


}
