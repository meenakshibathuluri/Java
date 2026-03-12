import java.util.Scanner;
public class MinValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of n:");
        int n = sc.nextInt();
        int min=Integer.MAX_VALUE;
        while (n>0){
            int remainder = n%10;
            if (remainder<min){
                min=remainder;
            }
            n/=10;
        }
        System.out.println(min);
    }
}
