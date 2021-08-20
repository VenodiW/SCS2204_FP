object FD_Q3 extends App {
  var bank:List[Account]=List()
  class Account(id:String, n:Int, b:Double){
    val nic:String = id
    val accnumber: Int = n
    val balance: Double = b

    override def toString = "["+nic+" : "+accnumber+" : "+balance+"]"

    def withdraw(a:Double):Account = this.balance-a
    def deposit(a:Double):Account = this.balance+a
    def transfer (a:Account, b:Double) = this.balance-b ; new Account(deposit(balance+b))

  }
}
