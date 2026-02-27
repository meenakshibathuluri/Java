import java.util.Scanner;

public class BiggestAmongThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a value");
        int a = sc.nextInt();
        System.out.println("Enter the b value");
        int b = sc.nextInt();
        System.out.println("Enter the c value");
        int c = sc.nextInt();

        if(a>b && a>c) {
            System.out.println("A is bigger");
        } else if(b>a && b>c) {
            System.out.println("B is bigger");
        } else if(c>a && c>b) {
            System.out.println("C is bigger");
        } else if(a==b && a!=c) {
            System.out.println("A and B are equal");
        } else if(a==c && a!=b) {
            System.out.println("A and C are equal");
        } else if(b==c && b!=a) {
            System.out.println("B and C are equal");
        } else {
            System.out.println("All are equal");
        }
    }
}