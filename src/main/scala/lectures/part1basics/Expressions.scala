package lectures.part1basics

object Expressions extends App {
  val x = 1 + 2 // expression
  println(x)
  // If expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aCondition)
  println(if(aCondition) 5 else 3)

  var i = 0
  val aWhile = while( i < 10) {
    println(i)
    i+=1
  } // aWhile type is Unit

  // Never write this again.
  // Everything in scala is an expression
  var aVariable = 3
  val aWeirdValue = (aVariable = 4) // Unit === void ()
  println(aWeirdValue)
  
  // side effects: printl(), whiles, reassigning
  
  // code blocks
  
  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z > 2) "hello" else "goodbye"
  } // aCodeBlock is also expression type is String because last expression returns string
}
