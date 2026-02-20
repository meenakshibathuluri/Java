import java.util.Scanner;
public class ReadDataFormUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the is Raining values:");
           boolean isRaining = sc.nextBoolean();
           System.out.println(isRaining);

           System.out.println("enter the values:");
           byte a = sc.nextByte();
           System.out.println(a);

        System.out.println("enter the values:");
        long val = sc.nextLong();
        System.out.println(val);

        System.out.println("enter the values:");
        short l = sc.nextShort();
        System.out.println(l);

        System.out.println("enter the values:");
        int b = sc.nextInt();
        System.out.println(b);

    }
}
