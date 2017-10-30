package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int numRows = 1;
        System.out.println(generate(numRows));
    }

    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> pascals = new ArrayList<>();
        for(int i = 0; i < numRows; ++i){
            if(i == 0){
                List<Integer> first = new ArrayList<>();
                first.add(1);
                pascals.add(first);
            } else if(i == 1) {
                List<Integer> second = new ArrayList<>();
                second.add(1);
                second.add(1);
                pascals.add(second);
            } else {
                List<Integer> next = new ArrayList<>();
                int nextSize = pascals.get(i-1).size()+1;
                for(int j = 0; j < nextSize; ++j){
                    if(j == 0){
                        next.add(1);
                    } else if(j == nextSize-1){
                        next.add(1);
                    } else {
                        next.add(pascals.get(i-1).get(j-1)+pascals.get(i-1).get(j));
                    }
                }
                pascals.add(next);
            }
        }
        return pascals;
    }
}
