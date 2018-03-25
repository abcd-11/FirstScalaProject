package first

class Calculator(brand:String) {

  val color:String = if(brand.equalsIgnoreCase("HP"))
    "blue"
  else if(brand.equalsIgnoreCase("TI"))
    "black"
  else
    "white"

  def add(m:Int,n:Int):Int = m+n

}
