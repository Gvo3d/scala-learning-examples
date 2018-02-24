package test.functions

object Timer extends App {

  def oncePerSecond(callback: () => Unit) {
    while (true) { callback(); Thread sleep 1000 }
  }

  def timeFlies() {
    println("time flies like an arrow...")
  }

  override def main(args: Array[String]) {
    oncePerSecond(timeFlies)
  }
}
