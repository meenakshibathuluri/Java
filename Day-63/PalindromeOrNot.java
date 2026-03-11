import java.util.Scanner;
public class PalindromeOrNot1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        int backup = n;
        int result = 0;

        while (n>0) {
            int remainder = n%10;
           result = result * 10 + remainder;
            n/=10;
        }
        if (result==backup) {
            System.out.println("It is Palindrome");
        } else {
            System.out.println("It is not Palindrome");
        }
    }
}
