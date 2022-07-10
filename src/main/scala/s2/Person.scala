package s2

case class Person(firstName:String, lastName: String);

object Person{

//  if person firstname name == jun, return A
//  if person lastname start whit lowerCase, return B
//  for all other cass, return c

  def classify(p:Person):String = {
    val result = p match {
      case Person("jun", _ ) => "A"
      case p if p.firstName.equals("jun") => "A"
//      case x:Person  if x.firstName.equals("jun") => "A"
      case p:Person if p.lastName.matches("[a-z].*") => "B"
      case _ => "C";
    }
    result;
  }
}
