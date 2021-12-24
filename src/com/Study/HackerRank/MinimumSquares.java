package com.Study.HackerRank;

import java.util.Scanner;

public class MinimumSquares {
//    A carpenter has a Rectangular shaped wood of size M*N. He has to make a furniture and for that he needs to cut the wood into square pieces as large as possible to make
//    the furniture. Write a program to cut the Rectangular shaped wood into minimum number X of possible square blocks without any wastage.
// Her Every block also a Square i.e. 3 x 4 length wood would have 12 blocks of Square Shape
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input size of rectangular wood : (M X N) : ");
        int M = sc.nextInt();
        int N = sc.nextInt();
        //the size of Wood (M*N)
        int result = NumberOfSquares(M,N);
        System.out.println(result);
    }

    public static int NumberOfSquares (int m , int n){
        if(m==n) return 1;
        int TotalBlocks = m * n;
        int count = 0;
        int side = Math.min(m,n);
        while(TotalBlocks !=0)
        {
           count += TotalBlocks / (side * side);
           TotalBlocks = TotalBlocks % (side * side);
           side = Math.min(side,TotalBlocks/side);
        }

        return count;
    }

}
