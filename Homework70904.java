package Homework0904;

import java.util.Scanner;

public class Homework70904 {
    public static void main(String[] args) {
        final int PIN = 8966;
        Scanner scanner = new Scanner(System.in);
        int pincode;

        for  (int i = 1; i < 4; i++) {
            System.out.println("Въведете пин  код");
            pincode = scanner.nextInt();
            System.out.println(pincode);
            if (pincode == PIN) {
                System.out.println("Правилно, добре дошли обратно");
            } else if (i < 3){
                System.out.println("Неправилно, опитайте отново");
            } else {
                System.out.println("Съжаляваме, акаунтът ви е заключен");
            }

        }


    }
}
