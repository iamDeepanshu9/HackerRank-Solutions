package com.Study.HackerRank;

import java.io.IOException;

import java.util.Scanner;
//15:02:30PM
//to
//27:02:30

class Result {
    public static String timeConversion(String s) {
        // Write your code here
        if(s.charAt(s.length()-2) == 'A'){
            if((s.substring(0,2)).equals("12"))
                return("00"+s.substring(2,8));

        }else{
            if(!(s.substring(0,2)).equals("12"))
                return(Integer.parseInt(s.substring(0,2))+12+s.substring(2,8));

        }
        return(s.substring(0,8));
    }

}

public class TimeConversion{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String result = Result.timeConversion(s);

        System.out.println(result);
    }
}

