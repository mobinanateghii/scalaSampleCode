package s1

import scala.io.StdIn;

/**
 * use run, compile, publishLocal in sbt shell
 * console in sbt shell =? run logical thing in this console(even use java lib).
 */

object ChatBot1 {

  def printHelloWorld(): Unit = {
    println("hello world test system!")
  }

  def main (args: Array[String]): Unit = {
    this.printHelloWorld()

    val name = StdIn.readLine("Hi! what is your name? ");
    println(s" $name, tell me something interesting , if you want to quit say 'bye!")

    var timeToBuy = false;
    while (!timeToBuy) {
      timeToBuy = StdIn.readLine(" >>> ") match {
        case "bye" => println("oky, bye")
          true;
        case "time" => println("time is: " + java.time.LocalTime.now())
//        case "time" => println(s"time is: ${java.time.LocalTime.now()}")
          false
        case _ => println("Hmm, interesting... ")
          false
      }
    }
  }
}
