package test.forloop

object Factorial extends App {
  def fac(n: Int) = {
    var r = 1
    for (i <- 1 to n) r = r * i
    r
  }

  println(fac(5))
}
