import java.util.Scanner;
public class FactorCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n = sc.nextInt();
         int factorcount = 0;
        for(int i=1;i<=n;i++) {
            if(n%i==0) {
                factorcount++;
            }
        }
        System.out.println(factorcount);
    }
}
