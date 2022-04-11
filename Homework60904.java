package Homework0904;

import java.util.Scanner;

public class Homework60904 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Input number: ");
        num = scanner.nextInt();
        int num2 = 0;
        do {

            num2 = num%10;
            num = num/10;

            System.out.print(num2);
        } while (num > 0);

    }
}
