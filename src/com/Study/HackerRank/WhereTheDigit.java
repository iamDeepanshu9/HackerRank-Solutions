package com.Study.HackerRank;

import java.util.Scanner;

public class WhereTheDigit {
//    The input string should not contain only integers or only alphabets.
//    The number of integers in the input string should not be less than 4.
//    Sample Input : ABC65D19HY09 Sample Output : 34671011
//    Explanation: There are 6 integers in the string which are at the index 3,4,6,7,10,11.
//    These indexes are joined to form a single numeric string 34671011.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter only Alphanumeric String : ");
        String str = sc.next();
        System.out.println(indexString(str));
    }
    public static String indexString(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))) result.append(i);

        }
        return result.toString();
    }

}
