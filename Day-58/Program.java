import java.util.Scanner;
public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the values of a:");
        int a = sc.nextInt();
        System.out.println("enter the values of b:");
        int b = sc.nextInt();
        if(a%3==0 && b%5==0) {
            System.out.println("3 and 5 is fizz bizz");
        } else if(a%3==0) {
            System.out.println("fizz");
        } else if(b%5==0){
            System.out.println("bizz");
        } else {
            System.out.print("a and b both are not divisiable:");
        }
    }
}
