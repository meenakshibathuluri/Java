import java.util.Scanner;
public class unaryoperators {
    public static void main(String[] args) {
        int a = 100;
        a++;
        System.out.println(a);
        int b = ++a;
        System.out.println(b);
        b = a--;
        System.out.println(b);
    }
}