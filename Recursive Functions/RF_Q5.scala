object RF_Q5 extends App{

  def isEven(n:Int): Boolean =n match{
    case 0 => true
    case x => isOdd(n-1)
  }

  def isOdd(n:Int):Boolean = !(isEven(n))

  def sum(n:Int):Int= n match {
    case 0 => n
    case x => n+sum(n-2)
  }

  def addEven(n:Int):Unit={
    if (isEven(n) == true){
      println(sum(n))
    }
    else{
      println(isEven(n))
    }
  }

  //will add even up to and including n
  addEven(6)
  addEven(14)
  addEven(9)
}
