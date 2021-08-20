object FD_Q2 extends App {
  class Rational (x:Int,y:Int) {
    def numer = x
    def denom = y
    def +(r: Rational) = new Rational(numer * r.denom + r.numer * denom, denom * r.denom)
    def neg = new Rational(-this.numer, this.denom)
    def -(r: Rational) = this+r.neg
    }

  val x = new Rational(3,4)
  val y = new Rational(5,8)
  val z = new Rational(2,7)

  println(x-y-z)
  }
