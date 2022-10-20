def palindrome[A](xs:List[A]):Boolean =
  def palindrome_rec[A](list1:List[A], list2:List[A]):Boolean =
    if list1.isEmpty && list2.isEmpty then true
    else if list1.head!=list2.head then false
    else palindrome_rec(list1.tail, list2.tail);

  palindrome_rec(xs, xs.reverse);

palindrome(List('a', 'I', 'a'));