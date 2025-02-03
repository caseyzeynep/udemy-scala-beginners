package lectures.part2oop

object OOBasics extends App {
  val person = new Person("John", 26) // prints 4
  // println(person.name) // name bastırılamaz
  println(person.x) // prints 2
  person.greet("Daniel") // John says: Hi, Daniel
  person.greet() // Hi, I am John

}

// constructor
class Person(name: String, val age: Int) // age class field, name class parameter
{
  // class body
  val x = 2 // class field
  println(3 + 1)

  // method
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // overloading
  def greet(): Unit = println(s"Hi, I am $name")

  // multiple constructors
  def this(name: String) = this(name, 0)
  def this() = this("John Doe")
}
