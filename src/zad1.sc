import scala.annotation.tailrec

def flatten1[A] (xss: List[List[A]]):List[A] =
  if xss.isEmpty then throw new Exception(s"pusta lista")
  @tailrec
  def flatten1_rec[A](xs: List[List[A]], newlist: List[A]):List[A] =
    if xs.isEmpty then newlist
    else flatten1_rec(xs.tail, newlist:::xs.head)
  flatten1_rec(xss, List());

flatten1(List(List(1, 3, 5), List(2, 8, 9)));



