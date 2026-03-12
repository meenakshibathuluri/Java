import java.util.Scanner;
public class  SumOfCountN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        int sum=0;

        while (n>0){
            int remainder=n%10;
            sum+=remainder;
            n/=10;
        }
        System.out.println(sum);
    }
}
