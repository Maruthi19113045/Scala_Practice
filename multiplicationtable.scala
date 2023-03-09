import scala.io.StdIn.readLong

object multiplicationtable {
  def main(args: Array[String])={

    println("enter the number:")
    var n =readLong()
    println("enter the even number")
    for(i<-0 to 20 if i!=6){
      println(n+"*"+i+"="+(n*i))
    }

  }

}
