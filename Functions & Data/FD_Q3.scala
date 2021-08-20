//19001908
object FD_Q3 extends App {

  class Account(id:String, n:Int, b:Double){
    var nic:String = id
    var accnumber: Int = n
    var balance: Double = b

    override def toString = "["+nic+" : "+accnumber+" : "+balance+"]"

    def withdraw(a:Double)= this.balance-a

    def deposit(a:Double)= this.balance+a

    def transfer (a:Account, b:Double) ={
      a.balance = a.balance + b
      this.balance = this.balance - b
    }
  }

  val user1 = new Account("675460809V" , 1180, 15000)
  val user2 = new Account("998020980V" , 6023, 7800)

  println(user1.transfer(user2,1000))
}
