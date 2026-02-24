import java.util.Scanner;
public class logical {
    public static void main(String[] args) {
        int a = 20;
        int b = 100;
        System.out.println((a<b) && (b>a));

        System.out.println((a>=b) || (a<=b));

        System.out.println((10<5) || (10>5));

        System.out.println((10>10) || (10<5));

        System.out.println(!(10>=10));          
    }
}
