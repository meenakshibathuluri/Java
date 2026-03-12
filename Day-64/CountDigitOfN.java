import java.util.Scanner;
public class CountDigitOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of n:");
        int n = sc.nextInt();
        int count = 0;

        while(n>0) {
            count++;
            n /= 10;
        }
        System.out.println(count);
    }
}
