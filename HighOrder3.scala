object HighOrder3 {
  def mathOperation(name: String):(Int,Int)=> Int= {
    (x: Int, y: Int) => {
      name match {
        case "addition" => x + y
        case "multiplication" => x * y
        case "division" => x / y
        case "subtraction" => x - y
      }
    }
  }

      def add: (Int, Int) => Int = mathOperation(name = "addition")

      def mul: (Int, Int) => Int = mathOperation(name = "multiplication")

      def div: (Int, Int) => Int = mathOperation(name = "division")

      def sub: (Int, Int) => Int = mathOperation(name = "subtraction")

      def main(args: Array[String]): Unit = {

        println(add(1,2))
      }
  }

