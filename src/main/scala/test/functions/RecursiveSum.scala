package test.functions

object RecursiveSum extends App {
  def recursiveSum(i: Int*): Int = {
    if (i.isEmpty) 0
    else i.head + recursiveSum(i.tail: _*)
  }

  println(recursiveSum(8, 5, 3, 2, 1))
}
