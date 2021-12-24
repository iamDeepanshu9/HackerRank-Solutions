package com.Study.HackerRank;

public class WhereTheDigit {
//    The input string should not contain only integers or only alphabets.
//    The number of integers in the input string should not be less than 4.
//    Sample Input : ABC65D19HY09 Sample Output : 34671011
//    Explanation: There are 6 integers in the string which are at the index 3,4,6,7,10,11.
//    These indexes are joined to form a single numeric string 34671011.
    public static void main(String[] args) {
        String str = "ABC65D19HY09";
        System.out.println(indexString(str));
    }
    public static String indexString(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))) result += i ;

        }
        return result;
    }

}
