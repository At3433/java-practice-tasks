package org.myProject.myApp;

import java.util.Scanner;

class Main {
    static final int INPUT_ROW_COUNT = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = new String[INPUT_ROW_COUNT];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextLine();
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    String tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        for (String element : array) {
            System.out.println(element);
        }
    }
}