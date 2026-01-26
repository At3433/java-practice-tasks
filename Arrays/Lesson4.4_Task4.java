package org.myProject.myApp;

import java.util.Random;
import java.util.Scanner;

class Main {
    static final int ARRAY_RANDOM_START = 0;
    static final int ARRAY_RANDOM_END = 11;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[scanner.nextInt()][scanner.nextInt()];
        long seedRandom = scanner.nextLong();
        int cutoffRowIndex = scanner.nextInt();

        fillArrayRandomly(array, seedRandom);
        printArray(array);
        System.out.println();

        array = modifyArray(array, cutoffRowIndex);
        printArray(array);
    }

    static void fillArrayRandomly(int[][] array, long seed) {
        Random random = new Random(seed);
        for (int row = 0; row < array.length; row++) {
            for (int i = 0; i < array[row].length; i++) {
                array[row][i] = random.nextInt(ARRAY_RANDOM_START, ARRAY_RANDOM_END);
            }
        }
    }

    static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

    static int[][] modifyArray(int[][] array, int cutoffRowIndex) {
        if (cutoffRowIndex < 0 || cutoffRowIndex >= array.length) {
            return array;
        }
        int[][] modifyArray = new int[array.length - 1][array[0].length];
        for (int i = 0; i < cutoffRowIndex; i++) {
            modifyArray[i] = array[i];
        }
        for (int i = cutoffRowIndex; i < modifyArray.length; i++) {
            modifyArray[i] = array[i + 1];
        }
        return modifyArray;
    }
}