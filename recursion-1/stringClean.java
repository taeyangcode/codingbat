/*
Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced to a single char. So "yyzzza" yields "yza".


stringClean("yyzzza") → "yza"
stringClean("abbbcdd") → "abcd"
stringClean("Hello") → "Helo"
*/

public String stringClean(String str) {
  if(str.length() < 2) return str;
  return str.charAt(0) == str.charAt(1) ? stringClean(str.substring(1)) : str.charAt(0) + stringClean(str.substring(1));
}
