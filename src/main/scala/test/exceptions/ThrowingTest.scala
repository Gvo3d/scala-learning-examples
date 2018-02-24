package test.exceptions

object ThrowingTest extends App {
  println("Opened")
  try {
    throw new TestException("test")
  } catch {
    case ex: TestException => println("Test throwed")
    case _ => println("Test not throwed")
  } finally {
    println("Closed")
  }
}
