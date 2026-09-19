package Strings;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = sc.nextLine();

        int digitsCount = 0;
   
method1:
        for(int i=0;i<word.length();i++) {
            if(word.charAt(i)>=48 && word.charAt(i)<=57) {
                digitsCount++;
            }
        }
// 0 - 48 1 = 49,2 = 50, 3 = 51, 4 = 52, 5 = 53, 6 = 54, 7 = 55, 8 = 56, 9 = 57

method2:
        //   for(int i=0;i<word.length();i++) {
        //   if(word.charAt(i)=='0' || word.charAt(i)=='1' || word.charAt(i)=='2' || word.charAt(i)=='3' || word.charAt(i)=='4' || word.charAt(i)=='5' || word.charAt(i)=='6' || word.charAt(i)=='7' || word.charAt(i)=='8' || word.charAt(i)=='9') {
        //   digitsCount++;
        //       }
        //        }
        System.out.println("Digits Count " + digitsCount);
    }
}