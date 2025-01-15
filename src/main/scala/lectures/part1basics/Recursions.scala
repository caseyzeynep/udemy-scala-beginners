package lectures.part1basics

import scala.annotation.tailrec

object Recursions extends App {
  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else n * factorial(n - 1)
  }
  @tailrec
  def tailFactorial(n: Int, acc: BigInt): BigInt = {
    if (n <= 1) acc
    else tailFactorial(n - 1, n * acc)
  }

  println(tailFactorial(10, 1))

  /* tailFactorial(10, 1)
  = tailFactorial (9, 10*1)
  = tailFactorial (8, 9*10*1)
  = tailFactorial (7, 8*9*10*1)
  ....
  = tailFactorial (2, 3*4*5...*10*1)
  = tailFactorial (1, 1*2*3*4*5...*10)
   */

  def concanate(word: String, n: Int, accumulator: String): Unit = {
    if (n < 1) println(accumulator)
    else concanate(word, n - 1, word + accumulator)
  }

  concanate("hello", 4, "")

  def isPrime(n: Int): Boolean = {
    def isPrimeUnit(t: Int, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) false
      else if (t <= 1) isStillPrime
      else isPrimeUnit(t - 1, n % t != 0 && isStillPrime)
    }
    isPrimeUnit(n / 2, true)
  }

  println(isPrime(10))
  println(isPrime(13))
  println(isPrime(19))
  println(isPrime(21))

  def fib(n: Int): Int = {
    def fiboTailRec(i: Int, last: Int, nextToLast: Int): Int = {
      if (i >= n) last
      else fiboTailRec(i + 1, last + nextToLast, last)
    }
    if (n <= 2) 1
    else fiboTailRec(2, 1, 1)
  }

  println(fib(8))
}
