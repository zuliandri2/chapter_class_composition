object class_compositions {

  def main(args: Array[String]): Unit = {

    val d = new D
    println(d.message)
    println(d.loadMessage)


    val richIterator = new RichStringItr
    richIterator.foreach(println)
  }

}
