package testS1

import org.scalatest.FunSuite

import java.time.LocalTime
import java.time.format.DateTimeFormatter

class TestChatBot2 extends FunSuite{

  test("test step fun of ChatBot2"){
    val response = s1.ChatBot2.step("aaaaaaaaa");
    assert(!response.timeToBye)
    assert(response.answer == "interesting ...")
  }

  /**
   * we dont need to use assert cause if LocalTime cant pars our response.answer throw exception and test will failed by its self
   */
  test("test time Step ChatBot2"){
    val response = s1.ChatBot2.step("time");
    val timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    val testAssert = LocalTime.parse(response.answer, timeFormatter)
  }

}
