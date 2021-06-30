package com.company;

public class NumberReverse {

    public static int numReverse (int num) {

        if (num == 0) return 0;

        int sign =  Math.abs(num)/num;
        int token =  Math.abs(num);
        int numLength = (int) (Math.floor(Math.log10(token)) + 1);


        int[] numArray = new int[numLength];

        for (int i = numLength - 1; i > -1; i--) {
            numArray[i] = token % 10;
            token =  (token / 10);
        }

        //arrayPrint(numArray);

        int result = 0;

        for (int i = 0; i < numLength; i++) {
          result += numArray[i] * Math.pow(10, i);
        }

        result = result * sign;

        return result;

    };

    private static void arrayPrint (int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.print(arr[arr.length-1]);
        System.out.println("]");

    };

    public static void printResult (int num) {
        int result = numReverse(num);
        System.out.println("The reverse number to " + num + " is " + result);
    };

}
