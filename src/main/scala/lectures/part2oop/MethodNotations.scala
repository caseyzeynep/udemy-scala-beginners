package lectures.part2oop

import scala.language.postfixOps

object MethodNotations extends App {
  class Person(val name: String, favouriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favouriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(nicName: String): Person = new Person(s"$name ($nicName)", favouriteMovie)
    def unary_! : String = s"$name, what the heck??" // spaces are important
    def unary_+ : Person = new Person(name, favouriteMovie, age + 1)
    def isAlive: Boolean = true
    def learns(subject: String) = s"$name learns $subject "
    def learnScala: String = this learns ("Scala")

    def apply(): String = s"Hi, my name is $name and I like $favouriteMovie "
    def apply(n: Int): String = s"$name watched $favouriteMovie $n times"

  }

  // 1) Infix notation = operator notation (syntactic sugar)
  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // equal above only works for single parameter

  // "operator" in Scala
  val tom = new Person("Tom", "Fight Club")
  println(mary + tom) // Mary is hanging out with Tom
  println(mary.+(tom)) // Mary is hanging out with Tom same above

  println(1 + 2)
  println(1.+(2)) // same above

  // ALL OPERATORS ARE METHODS

  // 2) Prefix notation
  val x = -1 // equivalent with 1.unary_-
  val y = 1.unary_-
  // unary_ prefix only works with - + ~ !

  println(!mary) // Mary, what the heck??
  println(mary.unary_!) //Mary, what the heck??

  // 3) Postfix notation
  println(mary.isAlive)
  println(mary isAlive) // only works without any parameter

  // 4) Apply
  println(mary.apply())
  println(mary()) // equivalent

  // Exercise
  println((mary + "the rockstar")())
  println((+mary).age)
  println(mary learnScala)
  println(mary(2))

}
