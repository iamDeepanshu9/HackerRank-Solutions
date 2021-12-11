package com.Study.HackerRank;


import java.util.List;
import java.util.Objects;

public class LonelyInteger {
    public static void main(String[] args) {
        List<Integer> arr = List.of(1,1,2,2,3,4,4);
        System.out.println(lonelyinteger(arr));
    }
    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        int count;
        for (int i = 0; i < a.size(); i++) {
            count=0;
            for (int j = 0; j < a.size(); j++) {
                if(Objects.equals(a.get(i), a.get(j))) count++;
            }
            if(count == 1)
                return a.get(i);
        }
        return -1;
    }
}
