package fr.esiee.devops.program

import scala.annotation.tailrec

object Program {

  /**
   * Examples :
   *    lpadZeros(i = 7, length = 3) = "007"
   *    lpadZeros(i = 18, length = 2) = "18"
   *    lpadZeros(i = 121, length = 2) = "12"
   *    lpadZeros(i = -1, length = 5) = "-00001"
   * @param i: A integer number to which we want to append Zeros on the left
   * @param nbZeros: Number of Zeros to append
   * @return
   */
  def lpadZeros(i: Int, length: Int): String =
  {
    val asString = ((0 to length).map{_ => "0"}.mkString + Math.abs(i).toString).takeRight(length)
    if(i < 0){
      "-"+asString
    } else {
      asString
    }
  }

  def isPrimeNumber(i: Int): Boolean =
    if (i <= 1)
      false
    else if (i == 2)
      true
    else
      !(2 until i).exists(n => i % n == 0)

  /**
   *
   * @param i: Index
   * @return fibonacci number at the specified index
   */
  def fibonacci1(n: Int): Long = n match {
    case 0 | 1 => n
    case _ => fibonacci1( n-1 ) + fibonacci1( n-2 )
  }

  def fibonacci2(i: Int): Long = {
    @tailrec
    def recursion(n: Int, a: Long, b: Long): Long = n match {
      case 0 => a
      case _ => recursion(n - 1, b, a + b)
    }
    recursion(i, 0 , 1)
  }


}
