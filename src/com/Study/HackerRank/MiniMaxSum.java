package com.Study.HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MiniMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Solution.miniMaxSum(arr);

        bufferedReader.close();
    }
}

class Solution
{
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);

        long max = (long)arr.get(4)+arr.get(3)+arr.get(2)+arr.get(1);
        long min = arr.get(0)+arr.get(1)+arr.get(2)+(long)arr.get(3);

        System.out.println(min+" "+max);

    }
}
