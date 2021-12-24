package com.Study.HackerRank;

public class EqualChocalateDistributution {
    public static void main(String[] args) {
        int TotalChocolate = 17;
        //X chocolates given to Alies and rest to the Bob
        //If Alies has more chocolate then he put back equal chocolate that bob have
        //e.g. Alies have 15 and Bob 5 then Alies put (15-5) chocolates back
        // COUNT number of round to get equal number of chocolates to both
        int X = 5;//Alies Chocolates

        int result = numberOFRound(TotalChocolate , X);
        System.out.println(result);
    }
    public static int numberOFRound(int n , int x)
    {
        int count = 0;
        int y = n - x;
        while(x!=y)
        {
            if(x>y)
            {
                x = x-y;
                count++;
            }
            else
            {
                y = y - x;
                count++;
            }
        }
        return count;
    }
}
