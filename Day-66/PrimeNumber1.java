import java.util.Scanner;
public class PrimeNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

       // Approach-1
        // int factorscount = 0;
        // for(int i=1;i<=n;i++) {
            // if(n%i==0) {
             // factorscount++;
            // }
         // }
     //
     // if(factorscount==2) {
        // System.out.println("Prime Number");
     // } else {
        // System.out.println("Not prime number");
     // }

        //Approach-2
       // int factorsCount = 0;
       // for(int i=2;i<n;i++) {
          // if(n%i==0) {
            // factorsCount++;
          // }
        // }
        // if(factorsCount==0) {
            // System.out.println("Prime number");
        // } else {
            // System.out.println("Not prime number");
        // }

        //Approaxh-3

        int factorsCount = 0;
        int squareRootOfN =(int) Math.sqrt(n); // double 8 bytes, int -> 4bytes, typecasting
        for(int i=2;i<=squareRootOfN;i++) {
            if(n%i==0) {
                factorsCount++;
            }
        }
        if(factorsCount==0) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not prime number");
        }
    }
}
