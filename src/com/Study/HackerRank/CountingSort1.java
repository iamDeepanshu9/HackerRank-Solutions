package com.Study.HackerRank;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class CountingSort1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        List<Integer> result = countingSort(arr);

    }
    public static List<Integer> countingSort(List<Integer> arr) {

        List<Integer> freqArray = new ArrayList<Integer>();
        int value;
        int freq;

        for(int i = 0; i < 100;i++){
            freqArray.add(0);
        }

        for(int i = 0; i < arr.size(); i++){
            value = arr.get(i);
            freq = freqArray.get(value);

            freqArray.set(value, freq+1);
        }

        return freqArray;


    }
}
