package org.myProject.myApp;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.nextLine();
        if (isGmailAddress(email)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static boolean isGmailAddress(String email) {
        int firstAtInex = email.indexOf('@');
        int lastAtIndex = email.lastIndexOf('@');
        if (firstAtInex != lastAtIndex || firstAtInex == 0) {
            return false;
        }

        String domain = email.substring(firstAtInex + 1);
        return domain.equals("gmail.com");
    }
}