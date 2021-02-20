abstract class A {
  val message: String
}

class B extends A {
  override val message: String = "I'am instance of class A"
}

trait C extends A {
  def loadMessage = message.toUpperCase()
}

class D extends B with C

abstract class AbsIterator {

  type T

  def hasNext: Boolean
  def next(): T

}

class StringIterator(s: String) extends AbsIterator {

  type T = Char

  private var i = 0

  override def hasNext: Boolean = i  < s.length

  override def next(): T = {
    val ch = s charAt i
    i += 1
    ch
  }

}

trait RichIterator extends AbsIterator {

  def foreach(f: T => Unit) = while (hasNext) f(next())
}

class RichStringItr extends StringIterator("Scala") with RichIterator