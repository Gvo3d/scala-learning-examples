package test.getters_setters

object Test extends App {
  println("A:")
  println(A.value)
  A.value = 2
  println(A.value)

  println("\nB:")
  println(B.per)
  B.per = 2
  println(B.per)
}


object A {
  var value = 1
}

object B {
  private var _per = 1

  def per = _per

  def per_=(value: Int) = {
    println("Setter is called")
    _per = value + 1
  }
}