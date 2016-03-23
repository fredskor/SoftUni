package com.company;
import java.util.*;

public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String s = console.nextLine();
        String[] splitStrings = s.split(" ");
        List<Integer> numbers = new ArrayList<>();

        if (splitStrings.length %2 == 0) {

            for (int i = 0; i < splitStrings.length; i++) {
                numbers.add(Integer.parseInt(splitStrings[i]));
            }
        }
        else {
            System.out.println("Invalid length");
        }

        for (int i = 0; i < numbers.size(); i += 2) {

            if (numbers.get(i) % 2 == 0 && numbers.get(i + 1) % 2 == 0) {
                System.out.printf("%1$d, %2$d -> both are even", numbers.get(i), numbers.get(i + 1));
                System.out.println();
            }

            else if (numbers.get(i) % 2 != 0 && numbers.get(i + 1) % 2 != 0) {
                System.out.printf("%1$d, %2$d -> both are odd", numbers.get(i), numbers.get(i + 1));
                System.out.println();
            }

            else {
                System.out.printf("%1$d, %2$d -> different", numbers.get(i), numbers.get(i + 1));
                System.out.println();
            }

        }

    }
}


