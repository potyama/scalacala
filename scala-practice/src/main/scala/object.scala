object Point {
  def apply(x: Int, y: Int): Point2 = new Point2(x, y)
}
//private[this]だとフィールドにアクセスできない。
class classmate(name: String, age: Int, private val num: Int)


object classmate {
  def printNum(): Unit = {
    val Taro = new classmate("Taro", 15, 1)
    println(Taro.num)
  }
}
