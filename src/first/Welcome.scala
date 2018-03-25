package first

import scala.collection.immutable.ListMap

object Welcome {
  def main(args:Array[String]): Unit  = {
    /*println("Welcome to the world of Scala!!!")
    val calc1 = new Calculator("hp")
    println("Color is:"+calc1.color)

    val scalc1 = new ScientificClass("TI")
    println(scalc1.log(4,5.6))
    println(scalc1.color)*/

    /*val s1 = new Circle(4)
    println(s1.getArea())
    println(s1.getPerimeter())*/

    /*println(addTwo(23,34))*/

   /* val times:Any = true


    times match {
      case i:Int if i<10 => println("value of i is less than 10")
      case i:Int => println("value of i is more than 10")
      case j:Double if j<10.67  => println("value of j is less than 10.67")
      case j:Double => println("Value of j is more than 10.67")
      case str:String => println("Received String")
      case _ => println("default mode")
    }

    val calc1 = Calci("HP","model1")
    val calc2 = Calci("DELL","model2")

    findCalci(Calci("wef","wefwef"))

    def findCalci(st:Calci):Unit = {

      st match {
        case Calci("LENOVO","model1") => println("Got lenovo")
        case Calci("HP","model1") => println("Got HP")
        case Calci("DELL","model2") => println("Got DELL")
        case Calci(_,_) => println("No calci matched")
      }

    }*/

    /*val map1 = Map(1->"one",2->"two",3->"three")
    println(map1.get(1) + " :: " + map1.get(1).isDefined)
    println(map1.get(4) + " :: " + map1.get(4).isDefined)
    println(map1.getOrElse(4,"No key found"))

    map1.get(4) match {
      case Some(n)=>println(n)
      case None=>println("No key found!!!")
    }*/

    /*val list1 = Array(1,2,3)
    println(list1.foreach((i:Int)=>print(i + " ")))

    println(list1.foreach( (i:Int) => i*2))
    println(list1.foreach((i:Int)=>print(i + " ")))*/

    exercise3()
  }

  def exercise1() = {
    val randNum = scala.util.Random.nextInt(10)
    var condition = true
    var cnt = 0

    while(condition){
      cnt+=1
      println("Enter your guess:")
      val input = scala.io.StdIn.readInt()
      if(input < randNum)
        println("Guess somewhat large number")
      else if(input > randNum)
        println("Guess somewhat small number")
      else {
        println("You guessed it right!!! " + cnt)
        condition = false
      }
    }
  }

  def exercise2() = {
    val studentMarks = List(12,15,8,20,23,4,19,25,9,21)

    val qualifyingMarks = studentMarks.filter(x=>x>=12)
    println("Qualifying Marks:"+qualifyingMarks)
    val sortedMarks = studentMarks.sorted
    println("Sorted Marks:"+sortedMarks)
    println("Min value is:"+studentMarks.min)
    println("Max value is:"+studentMarks.max)

    val result = studentMarks :+ studentMarks.foldLeft(0)((acc,ele)=>acc+ele)/studentMarks.size

    println("list with Average at the end is : " + result)
  }

  def exercise3() = {
    val str: String = "Bob didn't want a hair cut. At the salon, Bob did a bob while getting a bob cut."
    val seq1 = str.split(" ").toSeq
    val map1: scala.collection.mutable.Map[String, Int] = scala.collection.mutable.Map()

    println(seq1)

    seq1.toList.map((x:String)=>
    {
      if(map1.contains(x.trim.toLowerCase)) map1(x.trim.toLowerCase) = map1.get(x.trim.toLowerCase).get + 1
      else map1(x.trim.toLowerCase) = 1}
    )

    val map2 = ListMap(map1.toSeq.sortBy(x=>x._2)(Ordering.Int.reverse):_*)
    // val map3 = collection.mutable.Map(map2.toSeq:_*)
    map2.foreach(x=>{println("K::"+x._1 + " V::"+x._2)})
  }
}
