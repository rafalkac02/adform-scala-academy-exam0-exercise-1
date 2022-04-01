import org.scalatest._
import flatspec._
import matchers._
import WordValue._

class WordValueSpec extends AnyFlatSpec with should.Matchers {

  "A charScore()" should "return character's score. Each letter has a value associated from 1 to 26 according to position in alphabet. " +
    "The function is case-insensitive." in {

    charScore('a') shouldBe 1
    charScore('A') shouldBe 1
    charScore('d') shouldBe 4
    charScore('D') shouldBe 4
    charScore('z') shouldBe 26
    charScore('Z') shouldBe 26
  }

  "A charScore()" should "return 0 for every character that is not a letter" in {

    charScore('5') shouldBe 0
    charScore('!') shouldBe 0
  }


  "A wordScore()" should "return word's score according to its content. The function sums each char's score to get the word's score" in {

    wordScore("") shouldBe 0
    wordScore("a") shouldBe 1
    wordScore("z") shouldBe 26
    wordScore("cab") shouldBe 6
    wordScore("excellent") shouldBe 100
    wordScore("microspectrophotometries") shouldBe 317
  }
}