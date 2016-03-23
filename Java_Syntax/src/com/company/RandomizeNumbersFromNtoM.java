package com.company;

import java.util.*;

public class RandomizeNumbersFromNtoM {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        int M = console.nextInt();
        int maxValue = 0;
        int minValue  = 0;
        List<Integer> numbers = new ArrayList<>();

        if (N > M) {
            maxValue = N;
            minValue = M;
        } else if (N < M) {
            maxValue = M;
            minValue = N;
        } else {
            System.out.print(N);
        }

        for (int i = minValue; i <= maxValue; i++) {
            numbers.add(i);
            Collections.shuffle(numbers);
        }
        for (int item : numbers) {
            System.out.print(item + " ");
        }
    }
}