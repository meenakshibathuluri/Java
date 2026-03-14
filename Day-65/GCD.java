import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int n2 = sc.nextInt();
        int a = n1;
        int b = n2;
        if(n1>n2) {
            a = n1;
            b = n2;
        } else if(n2>n1) {
            a = n2;
            b = n1;
        }
        while (b!=0) {
            int rem = a%b;
            a = b;
            b = rem;
        }
        System.out.println(a);
    }
}
