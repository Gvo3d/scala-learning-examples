package test.collections

import scala.collection.SeqView

object CollectionMonades {
  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println("Simple")
    simpleMonadaExample(list).foreach(x => println(x))
    println("\nStream")
    listLn(streamMonadaExample(list).toList)
  }

  def simpleMonadaExample(list: List[Int]): List[Int] = {
    list.map(_ * 2).map(_ + 1).filter(_ % 3 != 0)
  }

  def streamMonadaExample(list: List[Int]): SeqView[Int, Seq[_]] = {
    list.view.map(_ * 2).map(_ + 1).filter(_ % 3 != 0)
  }

  def listLn(list: List[Int]) {
    list.foreach(x => println(x))
  }
}
