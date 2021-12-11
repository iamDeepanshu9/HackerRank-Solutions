package com.Study.HackerRank;

public class Pangram {
    public static void main(String[] args) {
        String str = "We promptly judged antique ivory buckles for the next prize";
        System.out.println(isPangrams(str));
    }
    public static String isPangrams(String s) {
        boolean[] check = new boolean[26];
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z')
                check[ch-'a']=true;
            else if(ch >= 'A' && ch <= 'Z')
                check[ch-'A']=true;
        }
        for(int i=0;i<26;i++)
        {
            if(!check[i])
                return "not pangram";
        }
        return "pangram";
    }
}
