package test.case_class

object PersonTester extends App {
  case class Person(name: String, surname: String)
  val vasya = Person("Vasiliy", "Pupkin")
  println("Equals: " + (vasya == new Person("Vasiliy", "Pupkin")))
  println("Objects links: " + (vasya eq new Person("Vasiliy", "Pupkin")))
  println(vasya.toString)

  case class Answer(number: Int = 42)
  val answer: Answer = Answer()
  val answer2 = Answer(43)
  println("\n" + answer)
  println(answer2)
}
