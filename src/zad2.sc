import scala.annotation.tailrec

def count[A](x:A, xs:List[A]):Int =
  if (xs.isEmpty) then throw new Error(s"pusta lista")
  @tailrec
  def count_rec[A](y:A, ys:List[A], counter:Int):Int =
    if ys.isEmpty then counter
    else if ys.head == y then count_rec(y, ys.tail, counter+1);
    else count_rec(y, ys.tail, counter);
  count_rec(x, xs, 0);
count('a', List('a', 'I', 'a'));