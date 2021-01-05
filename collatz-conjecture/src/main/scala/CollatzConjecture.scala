import scala.annotation.tailrec

object CollatzConjecture {
  def next_collatz(n:Integer):Int= if(n%2==0) {n/2} else {3*n+1}

  def steps(n: Int): Option[Int] = {
    @tailrec
    def iters(x: Int, result: Int): Option[Int] =
      if(x <= 0) None
      else {if (x == 1) Some(result)
      else iters(next_collatz(x), result + 1)}
    iters(n, 0)
  }
}