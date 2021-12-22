package com.Study.HackerRank;

import java.util.ArrayList;
import java.util.Arrays;

public class DioliteeQues {
    public static void main(String[] args) {
    int [] A1 = new int[6];
    int [] A2 = new int[5];

    A1 = new int[]{1, 2, 3, 4, 5, 8, 3, 2};
    A2 = new int[]{6, 7, 8, 5, 9};
    int [] Z = ans(A1,A2);
        System.out.println(Arrays.toString(Z));
    }
    public  static  int [] ans (int [] a , int [] b)
    {
       int [] res = new int[a.length + b.length];
       int i = 0;
       int j = 0;
       while(i<res.length)
       {
           if(j<Math.min(a.length,b.length))
           {
               res[i] = a[j];
               res[++i] = b[j];

               j++;
           }
           else if(a.length > b.length)
           {
               res[i] = a[j];
               j++;
           }
           else if(a.length < b.length)
           {
               res[i] = b[j];
               j++;
           }
           i++;

       }

       return res;
    }
}
