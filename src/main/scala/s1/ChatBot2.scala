package s1

import java.time.LocalTime
import java.time.format.DateTimeFormatter
import scala.io.StdIn

case class LineProcessResult(answer:String, timeToBye:Boolean);

object ChatBot2 {

  def main(args: Array[String]):Unit ={
    val name = StdIn.readLine("hey! what is your name? ");
    println(s"$name, tell me something interesting or say 'bye' for quit! ")

    var res = LineProcessResult("", false);
    while (!res.timeToBye){
      res = step(StdIn.readLine(">>"))
      println(res.answer);
    }
  }

  def step(input: String): LineProcessResult = {
    input match {
      case "bye" => LineProcessResult("okay, bye! ", true);
      case "time" => LineProcessResult(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")), false)
      case _ => LineProcessResult("interesting ...", false);
    }
  }

}


