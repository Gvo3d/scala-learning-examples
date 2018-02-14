package test.string

object Printer extends App {
  def printer(value: String) {
    println(s"Hello $value!")
  }

  val wrld = "world";
  printer(wrld)

  val a = 1
  val b = 2
  printer({(a+b).toString})
  printer{(a+b).toString}
}


