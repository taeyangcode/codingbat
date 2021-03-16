/*
Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops). 
Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).


count7(717) → 2
count7(7) → 1
count7(123) → 0
*/

public int count7(int n) {
  if(n == 0) return 0;
  return n % 10 == 7 ? 1 + count7(n / 10) : count7(n / 10);
}

/*
Answer explanation:

By checking if variable n is initially equal to 0, we confirm that if it is, that there is no possibility for the rightmost number to equal 7, and if not, to keep checking.
Next we check if n modulo 10 (which observes the rightmost digit) equals 7, which in this case increases the occurance of 7 by one.
Since there is the possibility that the number's rightmost digit could be 7 again, we run the method again but remove the rightmost digit (n / 10) since we just checked it.
In the case that the rightmost digit isn't 7, we don't add one to the amount of occurances and instead remove the rightmost digit (n / 10) and check again.

The method knows when to stop the recursion as since variable n is an int, once it reaches a single digit and is divided by 10, it will round down and always result in 0.
This finally returns 0 and adds this to the amount of occurences finishing the recursion.
*/
