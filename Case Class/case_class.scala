//19001908
object Case_Class extends App  {
  import math.{ sqrt, pow }

  case class Point(a:Int, b:Int){
    def x:Int=a
    def y:Int=b

    //q1
    def +(that:Point)=Point(this.x+that.x, this.y+that.y)

    //q2
    def move(dx:Int, dy:Int)= Point(this.x+dx, this.y+dy)

    //q3
    def distance(other:Point)= sqrt(pow(x - other.x, 2) + pow(y - other.y, 2))

    //q4
    def invert:Point = Point(y,x)

  }

  val p1= Point(2,3)
  val p2= Point(5,6)

  println(p1)
  println(p2)
  println(p1.move(2,3))
  println(p1+p2)
  println(p2.distance(p1))
  println(p1.invert)

}
