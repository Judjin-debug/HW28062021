package com.company;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input the number ");
        NumberReverse.printResult(Integer.parseInt(scan.next()));

	    NumberReverse.printResult(123);
	    NumberReverse.printResult(100);
        NumberReverse.printResult(-100);
        NumberReverse.printResult(0);
        NumberReverse.printResult(5);

        try {

            String filename = "src/text.txt";
            HashMap<String, Integer> hashMap = OneWord.textToHashMap(filename);
            hashMap.forEach((k, i) -> System.out.println("k=" + k + ", v=" + i + "; "));
            System.out.println("The number of single repetitions is " + OneWord.countSingleRepetitions(hashMap));
        } catch (IOException iex) {
            iex.printStackTrace();
        }
    }

}
