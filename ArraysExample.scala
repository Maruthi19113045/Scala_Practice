object ArraysExample {
  def main(args:Array[String]):Unit ={
    var myar:Array[String] =new Array[String](3)
    myar(0)="HELLO"
    myar(1)="Hai"
    myar(2)="Hai"
    println(myar(1))

    for(i<-myar){
      println(i)
    }
    var myarr2=Array(1,2,3,3)
    println(myarr2(1))
  }

}
