package com.examples.collections

import scala.util.Random

object Sequences extends App{

  val aSeq = Seq(1,2,3)
  println(aSeq.reverse)
  println(aSeq(2))
  val seq2 = aSeq ++ Seq(4,6,5)
  println(seq2.sorted)

  val range: Seq[Int] = 1 to 5
  range.foreach(println)

  // Ranges
  // (1 to 10).foreach(x => println(x+10))

  val aList = List(1,2,3)
  val prepended = 40 :: aList
  println(prepended)

  val bothend = 45 +: aList :+ 70
  println(bothend)

  val filledSeq = List.fill(4)("apple")
  println(filledSeq)

  println(aList.mkString("-"))

  val nums = Array(1,2,3)
  nums(0) = 5
  println(nums.mkString(","))


  val vec = Vector(1,2,3)
  println(vec)


  // This is a benchmark of List vs Vector

  val maxRuns = 1000
  val maxCapacity = 1000000
  def getWriteTime(collections: Seq[Int]): Double = {
    val r = new Random

      val times = for {
        it <- 1 to maxRuns
      } yield {
        val currentTime = System.nanoTime()
        collections.updated(r.nextInt(maxCapacity), r.nextInt())
        System.nanoTime() - currentTime
      }
    times.sum * 1.0 / maxRuns
  }

  val numbersList = (1 to maxCapacity).toList
  val numbersVector = (1 to maxCapacity).toVector

  println("List time: " + getWriteTime(numbersList))
  println("Vector time: " + getWriteTime(numbersVector))

}
