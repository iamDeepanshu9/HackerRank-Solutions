package com.company.Deepanshu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.Console;

class Solution {
    public static void goit(List<Integer> arr)
    {
        double totalCount = arr.size();
        if (totalCount == 0)
            return;
        double positiveCount = 0;
        double negativeCount = 0;
        double zeroCount = 0;

        for (int i = 0; i < totalCount; i++)
        {
            if (arr.get(i) > 0)
                positiveCount++;
            else if (arr.get(i) < 0)
                negativeCount++;
            else
                zeroCount++;
        }

        System.out.println((double) (positiveCount/totalCount));
        System.out.println((double) (negativeCount/totalCount));
        System.out.println((double) (zeroCount/totalCount));
    }

    }


public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Solution.goit(arr);

        bufferedReader.close();
    }
}