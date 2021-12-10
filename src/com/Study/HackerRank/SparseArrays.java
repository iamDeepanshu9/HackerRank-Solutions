package com.Study.HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Answer{
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here
        int temp;
        List<Integer> reslut = new ArrayList<>();
        for (int i = 0; i < queries.size(); i++) {
            temp = 0;
            for (int j = 0; j < strings.size(); j++) {
                if(queries.get(i).equals(strings.get(j)))
                    temp++;
            }
            reslut.add(temp);
        }
        return reslut;
    }
}


public class SparseArrays {
    public static void main(String[] args) {
       List<String> strings = List.of("ab'","abc'","ab'");
        List<String> queries = List.of("ab'","abc'","bc'");
        System.out.println(Answer.matchingStrings(strings,queries));
    }
}
