//19001908
object FD_Q4 extends App {

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

  val Bank = List(
    new Account("998020980V", 1340, 7800),
    new Account("893437588V", 4533, 500),
    new Account("959823475V", 6456, 35600),
    new Account("679346284V", 6756, 80),
    new Account("784568548V", 5455, -2600),
    new Account("937854853V", 6766, -25),
    new Account("936139678V", 9007, 15100),
    new Account("953197935V", 9432, 8960),
    new Account("975258273V", 1923, -4500),
    new Account("987547024V", 9890, -820),
    new Account("819047343V", 3453, 0),
    new Account("838563457V", 3465, 12350),
    new Account("989835838V", 4565, 84560),
    new Account("984378345V", 6576, 5230),
    new Account("679823834V", 5677, -1000),
  )

  //4.1
  val overdraft = Bank.filter((a)=> a.balance<0)
  println("Accounts with negative balances")
  for (i <- overdraft) {
    println(i)
  }

  //4.2
  val balance = Bank.map((x:Account) => x.balance).reduce((balance1,balance2)=> balance1+balance2)
  println("Sum of all account balances: " + balance)

  //4.3
  def interest(l: List[Account]) {
    for (a <- l) {
      if (a.balance > 0) a.balance = a.balance + a.balance * 0.05
      else if (a.balance < 0) a.balance = a.balance + a.balance * 0.1
    }
  }
  println("Balances of all accounts after interest")
  interest(Bank)
  for (i <- Bank) {
    println(i)
  }
}
