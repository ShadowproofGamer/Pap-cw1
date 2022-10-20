def sqrList(list:List[Int]):List[Int] =
  def sqrList_rec(remaining:List[Int], newlist:List[Int]):List[Int] =
    if remaining.isEmpty then newlist
    else sqrList_rec(remaining.tail, newlist:::List(remaining.head*remaining.head));
  sqrList_rec(list, List());

sqrList(List(1, 2, 3, -4));