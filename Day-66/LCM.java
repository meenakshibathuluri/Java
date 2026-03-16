import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num1:");
        int num1 = sc.nextInt();
        System.out.println("Enter the value of num2:");
        int num2 = sc.nextInt();

        int a = Math.max(num1,num2);
        int b = Math.min(num1,num2);

        while (b!=0) {
            int rem = a%b;
            a = b;
            b = rem;
        }
         int lcm = (num1*num2)/a;  //gcd of a,b is stored .lcm formula num1*num2/gcd(a,b)
        System.out.println(lcm);
    }
}
