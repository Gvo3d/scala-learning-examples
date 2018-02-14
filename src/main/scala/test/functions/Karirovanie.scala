package test.functions

object Karirovanie extends App {
  def printer(anyVal: AnyVal): Unit = println("Value is: " + anyVal)

  def typePrinter(any: Any): Unit = println("Type is: " + any.getClass)

  def sectionPrinter(name: String) = println(s"\n$name")

  def doWork(name: String, any: AnyVal): Unit = {
    sectionPrinter(name)
    printer(any)
    typePrinter(any)
  }

  def multiply(a: Int)(b: Int) = a * b
  val res1 = multiply(2)(3)

  def multiplySimple(a: Int, b: Int) = a * b
  val res2 = multiplySimple(2, 3)

  val multiplyByTen: (Int => Int) = multiply(10)
  val res3 = multiplyByTen(4)


  doWork("Multiply", res1)

  doWork("SimpleMultiply", res2)

  doWork("Function", res3)

  typePrinter(multiplyByTen)
}
