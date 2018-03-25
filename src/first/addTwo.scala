package first

object addTwo extends ((Int,Int) => Int) {
  /*def apply(m:Int,n:Int): Int = m+n*/
  override def apply(v1: Int, v2: Int): Int = v1+v2
}
