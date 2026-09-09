package Strings;

import java.util.Scanner;

public class CountSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = sc.nextLine();

        int spacesCount = 0;

        for(int i=0;i<word.length();i++) {
            if(word.charAt(i)==' ') {
                spacesCount++;
            }
        }
        System.out.println("Spaces Count: " + spacesCount);
    }
}   