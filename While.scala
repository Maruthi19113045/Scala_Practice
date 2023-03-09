 import scala.io.StdIn.readInt
 object While {
  def main(args:Array[String]): Unit = {
   var i=10;
   while (true){
    println("please enter your input")
    println("1.add 2. substract 3. divide 4. multiply")
    var choise=readInt()
    println("please enter a value")
    var a=readInt()
    println("please enter b value")
    var b=readInt()
    choise match {
     case 1 => println(a+b)
     case 2 => println(a-b)
     case 3 => println(a*b)
     case 4 => println(a/b)
     case _ => println("invalid input")
    }
   }
  }

}
