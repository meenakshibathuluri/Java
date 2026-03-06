import java.util.Scanner;
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n = sc.nextInt();
        int factorcount = 0;
        if(n>1) {
           for(int i=1;i<=n;i++) {
               if(n%i==0) {
                   factorcount++;
               }
           }
           if(factorcount==2) {
               System.out.println("it is prime number");
           } else {
               System.out.println("it is not prime number");
           }
        } else {
            System.out.println("it is not voild number,it should be above 1");
        }
    }
}
