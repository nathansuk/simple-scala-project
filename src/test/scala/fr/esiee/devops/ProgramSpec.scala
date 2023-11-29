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
      7 -> 13
    ).foreach{case (i, expected) =>
      Program.fibonacci1(i) shouldBe expected
    }
  }

  "lpadZeros" should "return the expected results" in {
    Map(
      (7, 3) -> "007",
      (18, 2) -> "18",
      (121, 2) -> "21",
      (-1, 5) -> "-00001"
    ).foreach { case ((input, length), expected) =>
      Program.lpadZeros(input, length) shouldBe expected
    }
  }

  "isPrimeNumber" should "return the expected results" in {
    Map(
      2 -> true,
      3 -> true,
      4 -> false,
      13 -> true,
      15 -> false
    ).foreach { case (number, expected) =>
      Program.isPrimeNumber(number) shouldBe expected
    }
  }

}
