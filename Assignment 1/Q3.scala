object Q3 extends App{
  def wholesale(x:Int):Double = {
    if (x > 50) {
      (24.95*0.60*x) + (3*50) + ((x-50)*0.75)
    } else
      (24.95*0.60*x) + (3*x)
  }
    print ("Wholesale cost for 60 copies is = Rs. "+ wholesale(60))
}
