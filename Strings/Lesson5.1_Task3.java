package org.myProject.myApp;

import java.util.Scanner;

class Main {
    static final int INPUT_ROW_COUNT = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] userInputLines = new String[INPUT_ROW_COUNT];
        for (int i = 0; i < INPUT_ROW_COUNT; i++) {
            String inputLine = scanner.nextLine();
            int firstIndex = inputLine.indexOf(';');
            int lastIndex = inputLine.lastIndexOf(';');
            userInputLines[i] = inputLine.substring(firstIndex + 1, lastIndex);
        }
        printCodeWord(userInputLines);
    }

    static void printCodeWord(String[] array) {
        for (String element : array) {
            System.out.print(element);
        }
    }
}