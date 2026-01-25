package org.myProject.myApp;

import java.util.Random;
import java.util.Scanner;

class Main {
    static int ARRAY_RANDOM_START = -5;
    static int ARRAY_RANDOM_END = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[scanner.nextInt()][scanner.nextInt()];
        int seedRandom = scanner.nextInt();

        ArrayUtils newArray = new ArrayUtils();
        newArray.fillArrayRandomly(array, seedRandom,
                ARRAY_RANDOM_START, ARRAY_RANDOM_END);
        newArray.printArray(array);

        int maxValue = newArray.findMaxValue(array);
        int countMax = newArray.countMaxElements(array, maxValue);
        System.out.println(maxValue + " " + countMax);
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

    int findMaxValue(int[][] array) {
        int maxValue = array[0][0];
        for (int[] row: array) {
            for (int number: row) {
                if (number > maxValue) {
                    maxValue = number;
                }
            }
        }
        return maxValue;
    }

    int countMaxElements(int[][] array, int maxValue) {
        int count = 0;
        for (int[] row: array) {
            for (int number: row) {
                if (number == maxValue) {
                    count++;
                }
            }
        }
        return count;
    }
}

