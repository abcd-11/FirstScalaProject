package first

class Circle(r:Int) extends  Shape with Car {
  override def getArea(): Int = r*r*r

  override def getPerimeter(): Int = r+r+r

  override val brand: String = ""
}
