package Homework0904;

import java.util.Scanner;

public class Homework50904 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input sentence: ");
        String sentence;
        sentence = scanner.nextLine();
        int numVowels = 0;
       for ( int i = 0; i < sentence.length(); i++) {
           if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'o'
           || sentence.charAt(i) == 'u' || sentence.charAt(i) == 'i'){
               numVowels++;
           }
       }
        System.out.println("Number of vowels is: " + numVowels);
    }
}
