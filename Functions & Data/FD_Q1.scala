object FD_Q1 extends App {
  class Rational (x:Int,y:Int){
    def numer = x
    def denom = y
    def add(r:Rational) = new Rational(numer * r.denom + r.numer * denom, denom * r.denom)
    def mul(r:Rational) = new Rational(numer * r.numer, denom * r.denom)
    def neg(r:Rational) = new Rational(-r.numer, r.denom)
    println(neg(3,4))
  }
}
