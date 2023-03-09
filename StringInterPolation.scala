object StringInterpolation {
  def main(args: Array[String])={
    var x=10
    print(s"the value of x is $x")
    var l=2.2
    var k=s"the is the value $x"
    println(k)
    println(f"this is string $l%2.20f $k%S")
    println(raw"the value \n of x is $x")
    println(s"the value$$e of x is $x")

  }

}
