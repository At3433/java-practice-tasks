package org.myProject.myApp;

import java.util.Scanner;

class Main22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        inputLine = inputLine.replace(";", ".,");
        System.out.println(inputLine);
    }
}