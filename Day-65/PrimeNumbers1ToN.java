import java.util.Scanner;
public class PrimeNumbers1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            int factorsCount = 0;
            for(int j=1;j<=i;j++) {
                if(i%j == 0) {
                    factorsCount++;
                }
            }
            if(factorsCount==2) {
                System.out.println(i);
            }
        }
    }
}
