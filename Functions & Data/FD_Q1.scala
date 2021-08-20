//19001908
object FD_Q1 extends App {
  class Rational (x:Int,y:Int){
    require(y > 0)

    def this(x:Int) = this(x,1)

    private def gcd(numer: Int, denom: Int): Int = if (denom == 0) numer else gcd(denom, numer % denom)

    def numer:Int = x / gcd(Math.abs(x), y)
    def denom:Int = y / gcd(Math.abs(x), y)

    def neg():Rational = new Rational(-this.numer,this.denom)

    override def toString: String = numer  + "/" + denom
  }

  var a = new Rational(3,4)
  var b = a.neg()
  println("Negative rational number of ", a, "is: ", b)
}
