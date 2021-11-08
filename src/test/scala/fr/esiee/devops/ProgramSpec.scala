package fr.esiee.devops

import fr.esiee.devops.program.Program
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ProgramSpec extends AnyFlatSpec with Matchers {

  //TODO: Fixme
  "Fibonacci" should "return the expected results" in {
    Map(
      0 -> 0,
      1 -> 1,
      2 -> 1,
      3 -> 2,
      7 -> 14
    ).foreach{case (i, expected) =>
      Program.fibonacci1(i) shouldBe expected
    }
  }

  //TODO: Implement tests
  "lpadZeros" should "return the expected results" in {
    ???
  }

  //TODO: Implement tests
  "isPrimeNumber" should "return the expected results" in {
    ???
  }

}
