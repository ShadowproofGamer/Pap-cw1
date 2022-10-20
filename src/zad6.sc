def listLength[A](xs:List[A]):Int =
  def listLength_rec[A](ys:List[A], counter:Int):Int =
    if ys.isEmpty then counter
    else listLength_rec(ys.tail, counter+1);

  listLength_rec(xs, 0);

listLength(List('a', 'i', 'k', 'm', 's'));
    