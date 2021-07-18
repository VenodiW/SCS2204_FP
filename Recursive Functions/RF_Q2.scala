object RF_Q2 extends App{

  def GCD(a:Int, b:Int):Int = b match{
    case 0 => a
    case x if(x>a) => GCD(x,a)
    case x => GCD(x, a%x)
  }

  def prime(p:Int, n:Int=2):Boolean= n match{
    case x if(x==p)=> true
    case x if(GCD(p,x)>1) => false
    case x => prime(p,x+1)
  }

  def printprime(n:Int):Unit={
    if (prime(n) == true) {
     println(n)
     printprime(n-1)
    }
      else printprime(n-1)
  }

  printprime(10)
}
