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

        fillArrayRandomly(array,seedRandom);
        printArray(array);
        System.out.println();
        printRowMaxIndices(array);
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
            for (int i : row) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }

    static void printRowMaxIndices(int[][] array) {
        int firstMaxIndex;
        for (int[] row : array) {
            firstMaxIndex = findMaxIndex(row);
            System.out.print(firstMaxIndex + " ");
        }
    }

    static int findMaxIndex(int[] array) {
        int firstMaxIndex = 0;
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
                firstMaxIndex = i;
            }
        }
        return firstMaxIndex;
    }
}

