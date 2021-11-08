package fr.esiee.devops

import fr.esiee.devops.program.Program

import scala.util.Random

object Main extends App {

  def getResult: String = {
    val i = Random.nextInt(2000)
    println(s"Trying with $i")
    if(Program.isPrimeNumber(i))
      {
        println("Computing fibo")
        Program.fibonacci1(i).toString
      }
    else getResult
  }

  println(getResult)

}
