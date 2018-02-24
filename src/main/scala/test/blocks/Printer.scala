package test.blocks

object Printer extends App {
  var x = 3
  val y = 4

  def fuck = {
    x = x + y; y + 1
  }

  println(fuck);
}
