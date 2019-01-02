package com.examples

object AnonymousFunctions extends App {

  // Anonymous function (Lambda)
  val doubler: Int => Int = (x: Int) => x * 2
  val doubler2 = (x: Int) => x * 2 // shorthand
  println(doubler(10))  // 20


  // Multiple params
  val adder: (Int, Int) => Int = (a: Int, b: Int) => a + b
  println(adder(10, 2)) // 20

  // no params
  var justDoSomething: () => Int = () => 2
//  println(justDoSomething)

  // Moar syntactic sugar
  val niceIncrementer: Int => Int = (x: Int) => x + 1   // a.
  val niceIncrementer2: Int => Int = _ + 1   // equivalent to a. function
  println(niceIncrementer2(2))

  val niceAdder: (Int, Int) => Int = (a: Int, b: Int) => a + b   // b.
  val niceAdder2: (Int, Int) => Int = _ + _   //  equivalent to b. function

}
