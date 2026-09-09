package Strings;

import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word:");
        String word = sc.nextLine();

        int vowelsCount = 0;
        int consonantsCount = 0;
        for(int i=0;i<word.length();i++) {
            if(word.charAt(i) == 'A' || word.charAt(i)=='E' || word.charAt(i)=='I' || word.charAt(i)=='O' || word.charAt(i)=='U' ||
            word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u') {
                vowelsCount++;
            } else {
                consonantsCount++;
            }
        }
        System.out.println("Vowels Count " + vowelsCount);
        System.out.println("Consonants Count " + consonantsCount);
    }
}