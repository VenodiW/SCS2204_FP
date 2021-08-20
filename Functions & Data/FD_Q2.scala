//19001908
object FD_Q2 extends App {
  class Rational (x:Int,y:Int) {
    require(y > 0)

    def this(x:Int) = this(x,1)

    private def gcd(numer: Int, denom: Int): Int = if (denom == 0) numer else gcd(denom, numer % denom)

    def numer:Int = x / gcd(Math.abs(x), y)
    def denom:Int = y / gcd(Math.abs(x), y)

    def -(r: Rational):Rational = new Rational(this.numer * r.denom - this.denom * r.numer, this.denom * r.denom)

    override def toString: String = numer  + "/" + denom
    }

  val x = new Rational(3,4)
  val y = new Rational(5,8)
  val z = new Rational(2,7)

  println(x-y-z)
  }
