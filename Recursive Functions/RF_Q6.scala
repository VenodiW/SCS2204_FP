object RF_Q6 extends App{
  def fibonacci(n:Int): Int= n match{
    case 0 => 0
    case 1 => 1
    case x => fibonacci(n-1) + fibonacci(n-2)
  }

  println(fibonacci(5))
  println(fibonacci(9))
}
