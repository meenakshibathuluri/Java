import java.util.Scanner;
public class MaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of n:");
        int n = sc.nextInt();
        int max=Integer.MIN_VALUE;
        while (n>0){
            int remainder = n%10;
            if (remainder>max){
                max=remainder;
            }
            n/=10;
        }
        System.out.println(max);
    }
}
