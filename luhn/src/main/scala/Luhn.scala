object Luhn{
def valid(CardString:String):Boolean = {
  val CleanString = CardString.filter(_ != ' ')
  if (CleanString == "0"){false}
  else if (!CleanString.matches("\\d+")){false}
  else {
    val CardList = CleanString.toList
    val EvenList = CardList.zipWithIndex.collect({case (e,i) if ((i+CardList.length) % 2) == 0 => if(e.asDigit == 9) {9} else {(e.asDigit *2) % 9}})
    val OddList = CardList.zipWithIndex.collect({case (e,i) if ((i+CardList.length) % 2) == 1 => e.asDigit})
    (EvenList.sum + OddList.sum) % 10 == 0
  }

}

}