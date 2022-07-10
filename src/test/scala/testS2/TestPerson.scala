package testS2

import org.scalatest.FunSuite
import s2.Person

/**
 * you can use ''s2.person. -- '' just when person is an object
 */
class TestPerson extends FunSuite{

  test("test first case, Person('jun', _"){
    assert(s2.Person.classify(new Person("jun", "xyz")) == "A")
//    assert(s2.Person.classify(Person("jun", "111")) == "A")
  }

  test("test second case, Person(_, sara"){
    assert(s2.Person.classify(Person("xyz", "sara")) == "B")
  }

  test("test third case, Person(_, _"){
    assert(s2.Person.classify(Person("xyz", "xyz")) == "C")
  }
}
