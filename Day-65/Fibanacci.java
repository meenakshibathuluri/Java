import java.util.Scanner;
public class Fibanacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        if(n<=0) {
            System.out.println("Please enter the number above 0");
        } else if(n==1) {
            System.out.println(0);
        } else if(n==2) {
            System.out.print( 0 );
            System.out.println(1);
        } else  {
            int n1 = 0;
            int n2 = 1;
            System.out.print(n1 + " " );
            System.out.print(n2 + " ");
            for(int i=0;i<n-2;i++) {
                int next = n1+n2;
                System.out.print(next + " ");
                n1 = n2;
                n2 = next;
            }
        }
    }
}
