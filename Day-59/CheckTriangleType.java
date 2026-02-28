import java.util.Scanner;
public class CheckTriangleType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first side of traingle");
        int side1 = sc.nextInt();
        System.out.println("enter the second side of traingle");
        int side2 = sc.nextInt();
        System.out.println("enter the thrid side of traingle");
        int side3 = sc.nextInt();
        if(side1==side2 && side2==side3) {
            System.out.println("it is equilateral");
        } else if(side1==side2 || side2==side3 || side3==side1) {
            System.out.println("it is isosceles");
        } else  {
            System.out.println("it is scalene");
        }
    }
}
