package org.example;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(12);
        number.add(18);
        number.add(21);
        for (Integer numbers: number){
            System.out.println(numbers);
        }

    }
}