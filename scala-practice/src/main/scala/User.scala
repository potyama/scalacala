class test(val name: String, val age: Int)

object User{
  def printUser(user: test) = println(user.name + " " + user.age)
  def printAge(user: test): Unit = println(user.age)
}
