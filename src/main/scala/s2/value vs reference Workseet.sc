/**
 * different object is compare in 'eq'
 * for '==' compare args and value
 * different between case class and real class in scala
 *
 * A class can extend another class, whereas a case class can not extend another case class
 * (because it would not be possible to correctly implement their equality).
 */


class NCPoint(x:Int, y:Int);
case class CPoint(x:Int, y:Int)

val ncp1 = new NCPoint(1, 1);
val ncp2 = new NCPoint(1, 1);

val cp1 = new CPoint(1, 1)
val cp2 = new CPoint(1, 1)

ncp1 == ncp2
ncp1 eq ncp2

cp1 == cp2
cp1 eq cp2

