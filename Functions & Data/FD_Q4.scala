object FD_Q4 extends App {
  var bank: List[Account] = List()
  val find = (n:String, b:List[Account])=> b.filter(x=>x.nic.equals(n))

  class Account(id:String, n:Int, b:Double) {
    val nic: String = id
    val accnumber: Int = n
    val balance: Double = b

    override def toString = "[" + nic + " : " + accnumber + " : " + balance + "]"
  }

  val overdraft = (b:List[Account]) => b.filter(_<0)
  val balance = (b:List[Account]) => b.reduce()
  val interest = (b:List[Account]) => b.map()

}
