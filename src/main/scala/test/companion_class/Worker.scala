package test.companion_class

class Worker {
  val prefix = "Hello"

  def printMe = println(Worker.doSomething(prefix))
}

object Worker {
  def doSomething(prefix: String): String = {
    s"$prefix world!"
  }
}