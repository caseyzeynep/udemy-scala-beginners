package lectures.part1basics

object StringOpt extends App {
  // interpolators
  // Scala specific: String interpolators

  // 1 s interpolator
  val name = "David"
  val age = 12
  val greeting = s"Hello my name is $name. I am $age years old"
  val greeting1 = s"Hello my name is $name. I will be turning ${age + 1} years old"

  println(greeting)
  println(greeting1)

  // F interpolators
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burger per minute"
  println(myth) // David can eat 1.20 burger per minute

  // raw interpolators

  println(raw"This is a \n new line") // This is a \n new line // new line koymuyor aslında
  val escaped = "This is a \n new line"
  println(raw"$escaped") // new line koyuyor
  /* This is a
   new line
   */

}
