package com.Study.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDiffrence {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> a = List.of(1,2,4);
        List<Integer> b = List.of(2,5,6);
        List<Integer> c = List.of(7,5,9);
        arr.add(a);
        arr.add(b);
        arr.add(c);
        System.out.println(arr);
        System.out.println(diagonalDifference(arr));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int diagon1 = 0;
        int diagon2 = 0;
     if(arr.size()!=0){
         int j = 0;
         int k = arr.get(0).size()-1;
         for (int i = 0; i < arr.get(0).size(); i++) {

                 diagon1 += arr.get(i).get(j);
                 j++;
                 diagon2 += arr.get(i).get(k);
                 k--;
         }
         System.out.println(diagon1 + " " + diagon2);
         int result =  diagon1 - diagon2;
         if(result>=0)
             return result;
         else
             return result * (-1);
     }
     else
         return 0;
    }
}