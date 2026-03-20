import java.util.Scanner;
public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
            System.out.print(" *");
        }
       for(int j=0;j<n;j++) {
           System.out.println(" *");
       }
        for(int i=0;i<=n;i++) {
            System.out.print(" *");
        }
    }
}
