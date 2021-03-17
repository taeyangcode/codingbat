/*
Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.


endX("xxre") → "rexx"
endX("xxhixx") → "hixxxx"
endX("xhixhix") → "hihixxx"
*/

public String endX(String str) {
  if(str.length() < 2) return str;
  return str.charAt(0) == 'x' ? endX(str.substring(1)) + "x" : str.charAt(0) + endX(str.substring(1));
}
