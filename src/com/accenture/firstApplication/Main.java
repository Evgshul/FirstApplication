package com.accenture.firstApplication;

import java.util.Random;

public class Main {


    public static int number = 0;

    public static void main(String[] args) {
        // write your code here

        System.out.println("Hello, World");
        int anothernumber = 5;

        String s = "Sum of numbers and anotherNumbers ";
        System.out.println(s + " " + (number + anothernumber));
        String greetings = "Hello, Words";
        System.out.println(greetings);

        int[] arArray = new int[10];
        arArray[0] = 100;
        arArray[1] = 200;
        int[] secondArray = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};

        System.out.println(secondArray[3]);

        for (int i = 0; i < secondArray.length; i++) {

            System.out.print(secondArray[i] + " ");
        }

        System.out.println();
        {
            for (int i : secondArray) System.out.print(i + " ");
        }

        System.out.println();

        double[][] doublesMultidementionArray = createDoublesMuktidimensionalArray(5);

        printDoubledimArray(doublesMultidementionArray);
    }

    public static double[][] createDoublesMuktidimensionalArray(int size) {

        double[][] twoDimensionsArray = new double[size][size];

        Random random = new Random();
        for (int i = 0; i < twoDimensionsArray.length; i++) {
            for (int j = 0; j < size; j++) {
                twoDimensionsArray[i][j] = random.nextDouble() * 100;
            }
        }
        return twoDimensionsArray;
    }


    public static void printDoubledimArray(double[][] array) {

        for (double[] row : array) {
            System.out.println();
            for (double singleElement : row) {
                System.out.printf("%-10f", singleElement );
            }
        }
    }
}
