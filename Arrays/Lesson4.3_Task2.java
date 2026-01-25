package org.myProject.myApp;

import java.util.Random;
import java.util.Scanner;

class Main {
    static int ARRAY_RANDOM_START = -10;
    static int ARRAY_RANDOM_END = 11;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[scanner.nextInt()][scanner.nextInt()];
        int seedRandom = scanner.nextInt();

        ArrayUtils newArray = new ArrayUtils();
        newArray.fillArrayRandomly(array, seedRandom,
                ARRAY_RANDOM_START, ARRAY_RANDOM_END);
        newArray.printArray(array);
        System.out.println();

        int column = 0;
        int sumElements;
        while (column < array[0].length) {
            sumElements = newArray.sumPositiveColumnsElements(array, column);
            System.out.print(sumElements + " ");
            column++;
        }
    }

}

class ArrayUtils {
    void fillArrayRandomly(int[][] array, int seed, int randomMin, int randomMax) {
        Random random = new Random(seed);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(randomMin, randomMax);
            }
        }
    }

    void printArray(int[][] array) {
        for (int[] row : array) {
            for (int number : row) {
                System.out.print(number + "\t");
            }
            System.out.println();
        }
    }

    int sumPositiveColumnsElements(int[][] array, int column) {
        int sumElements = 0;
        for (int[] arr: array) {
            if (arr[column] > 0) {
                sumElements += arr[column];
            }
        }
        return sumElements;
    }
}

