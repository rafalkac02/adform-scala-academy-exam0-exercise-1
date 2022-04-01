object WordValue{

  // assign letters a, b, c, ... , z with values of 1, 2, 3, ... , 26
  var letters = ('a' to 'z').zip(1 to 26).toMap

  def charScore(c: Char): Int = {
    letters.getOrElse(c.toLower, 0)
  }

  def wordScore(word: String): Int = {
    word.map(charScore).sum
  }
}