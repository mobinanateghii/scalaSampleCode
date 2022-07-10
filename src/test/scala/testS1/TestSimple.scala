package testS1

import org.scalatest.FunSuite

/**
 * if use command 'test' in sbt it should run any test in test folder of your projects
 */

class TestSimple extends FunSuite{

  test("test always pass..."){
    assert(1 == 1)
  }

  test("test always fail..."){
    assert(1 == 2)
  }

}
