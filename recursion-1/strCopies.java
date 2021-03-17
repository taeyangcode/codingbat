/*
Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear in the string somewhere, possibly with overlapping. N will be non-negative.


strCopies("catcowcat", "cat", 2) → true
strCopies("catcowcat", "cow", 2) → false
strCopies("catcowcat", "cow", 1) → true
*/

public boolean strCopies(String str, String sub, int n) {
  if(str.length() < sub.length()) return false;
   n -= str.substring(0, sub.length()).equals(sub) ? 1 : 0;
  return n <= 0 ? true : strCopies(str.substring(1), sub, n);
}
