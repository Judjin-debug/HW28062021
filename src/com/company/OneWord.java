package com.company;

import java.io.IOException;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class OneWord {

    /*public static void main (String... args) throws IOException {
        String filename = "src/text.txt";
        HashMap <String, Integer> hashMap = textToHashMap(filename);
        hashMap.forEach((k, i) -> System.out.println("k=" + k + ", v=" + i + "; "));
        System.out.println("The number of single repetitions is " + countSingleRepetitions(hashMap));

    }

     */

    public static HashMap <String, Integer> textToHashMap (String filename) throws IOException {
        BufferedReader reader;
        HashMap <String, Integer> result = new HashMap<>();

        try {

            reader = new BufferedReader(new FileReader(filename));
            String[] textArray = reader.lines().toArray(String[]::new);
            StringBuffer text = new StringBuffer();
            for (String s : textArray) {
                text.append(s);
            }
            String[] wordArray = text.toString().split("\\W+");


            String token;
            int repetitionCount = 1;

            int listLength = wordArray.length;
            for (int i = listLength - 1; i > -1; i--) {
                token = wordArray[i];
                if (!result.containsKey(token)) {
                    repetitionCount = 1;
                    for (int j = i - 1; j > -1; j--) {
                        if (token.equals(wordArray[j])) {
                            repetitionCount++;
                        }
                        result.put(token, repetitionCount);
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;

    }

    public static int countSingleRepetitions (HashMap <String, Integer> hashMap) {
        Integer[] arr = hashMap.values().toArray(Integer[]::new);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            };
        }
        return count;
    };

}