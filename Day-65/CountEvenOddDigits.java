import java.util.Scanner;
public interface CountEvenOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int evenCount = 0;
        int oddCount = 0;

        while (n>0) {
            int digits = n%10;
            if(digits%2==0) {
                evenCount++;
            } else {
                oddCount++;
            }
            n/=10;
        }
        System.out.println("Even Digits count " + evenCount);
        System.out.println("Odd Digits count " + oddCount);
    }
}
