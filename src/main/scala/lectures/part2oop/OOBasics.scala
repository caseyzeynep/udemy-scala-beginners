package lectures.part2oop

object OOBasics extends App {
  val person = new Person("John", 26) // prints 4
  // println(person.name) // name bastırılamaz
  println(person.x) // prints 2
  person.greet("Daniel") // John says: Hi, Daniel
  person.greet() // Hi, I am John

  val author = new Writer("Charles", "Dickens", 1812)
  val imposter = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)

  println(novel.authorAge) // 49
  println(novel.isWrittenBy(author)) // true
  println(novel.isWrittenBy(imposter)) // false

  val counter = new Counter
  counter.increment.print
  counter.increment.increment.increment.print
  counter.increment(10).print

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

class Writer(firstName: String, surname: String, val yearOfBirth: Int) {
  def fullName = s"${firstName} ${surname}"
}

class Novel(name: String, yearOfRelease: Int, author: Writer) {
  def authorAge = yearOfRelease - author.yearOfBirth
  def isWrittenBy(author: Writer) = this.author == author
  def copy(newYearOfRelease: Int): Novel = new Novel(name, newYearOfRelease, author)
}

class Counter(val count: Int = 0) {
  def increment = {
    println("incrementing")
    new Counter(count + 1)
  } // immutability}
  def decrement = {
    println("decrementing")
    new Counter(count - 1)
  }

  def increment(n: Int): Counter = {
    if (n <= 0) this
    else increment.increment(n - 1)
  }

  def decrement(n: Int): Counter = {
    if (n <= 0) this
    else decrement.decrement(n - 1)
  }

  def print = println(count)

}
