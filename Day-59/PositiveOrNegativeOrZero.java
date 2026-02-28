import java.util.Scanner;
public class PositiveOrNegativeOrZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of num");
        int num = sc.nextInt();
        if(num > 0) {
            System.out.println("it is positive");
        } else if(num < 0) {
            System.out.println("it is negative");
        } else {
            System.out.println("it is zero");
        }
    }
}
