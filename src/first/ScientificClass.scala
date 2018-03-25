package first

class ScientificClass(brand:String) extends  Calculator(brand) {
  def log(m:Int,base:Double):Double = math.log(m)/math.log(base)
}
