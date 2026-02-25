import java.util.Scanner;
public class logical {
    public static void main(String[] args) {
        int a = 10;
           int b = 20;
           int sum = a++ + ++b + ++a + b++;
           System.out.println(sum);
        System.out.println(a);
        System.out.println(b);
    }
}
