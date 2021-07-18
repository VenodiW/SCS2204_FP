object RF_Q3 extends App{

  def sum(n:Int):Int= n match {
    case 0 => n
    case x => n+sum(n-1)
  }

  println(sum(5))
}
