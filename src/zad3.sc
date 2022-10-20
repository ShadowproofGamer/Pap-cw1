def replicate[A](x:A, n:Int):List[A] =
  def replicate_rec[A](y:A, m:Int, list:List[A]):List[A] =
    if m==0 then list
    else replicate_rec(y, m-1, list:::List(y));
  replicate_rec(x, n, List());
replicate("la", 3);