import java.util.Scanner;
public class PrefectNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        int sum = 0;
        for(int i=1;i<=n/2;i++) {
            if(n%i==0) {
                sum += i;
            }
        }
        if(sum==n) {
            System.out.println("Prefect number");
        } else {
            System.out.println("Not Prefect number");
        }
    }
}
