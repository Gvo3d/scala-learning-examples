package test.forloop

object ForLooper extends App {
  for (i <- 1 to 5) println(i)
  println()
  for (i <- 1 until 5) println(i)
}
