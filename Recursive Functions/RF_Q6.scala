object RF_Q6 extends App{
  def fibonacci(n:Int): Int= n match{
    case 0 => 0
    case 1 => 1
    case x => fibonacci(n-1) + fibonacci(n-2)
  }
  
  def printfibonacci(n:Int): Unit={
    if(n>1) printfibonacci(n-1)
    print(fibonacci(n)+ "\t")
  }

  printfibonacci(5)
  println()
  printfibonacci(9)
}
