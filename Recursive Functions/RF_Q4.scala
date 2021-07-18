object RF_Q4 extends App{

  def isEven(n:Int): Boolean =n match{
    case 0 => true
    case x => isOdd(n-1)
  }

  def isOdd(n:Int):Boolean = !(isEven(n))

  println(isEven(8))
  println(isEven(13))

}
