package org.myProject.myApp;

import java.util.Random;
import java.util.Scanner;

class Main {
    static final int ARRAY_RANDOM_START = -3;
    static final int ARRAY_RANDOM_END = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        long seedRandom = scanner.nextLong();

        fillArrayRandomly(array, seedRandom);
        printArray(array);
        int[] modifyArray = removeAfterMax(array);
        printArray(modifyArray);

    }

    static void fillArrayRandomly(int[] array, long seed) {
        Random random = new Random(seed);
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(ARRAY_RANDOM_START, ARRAY_RANDOM_END);
        }
    }

    static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
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

    static int[] removeAfterMax(int[] array) {
        int firstMaxIndex = findMaxIndex(array) + 1;
        int[] modifyArray = new int[firstMaxIndex];
        for (int i = 0; i < firstMaxIndex; i++) {
            modifyArray[i] = array[i];
        }
        return modifyArray;
    }
}

