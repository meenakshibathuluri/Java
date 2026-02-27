import java.util.Scanner;
public class MinorOrMajor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age value:");
        int age = sc.nextInt();
        if(age <= 18) {
            System.out.println("minor");
        } else  {
            System.out.println("major");
        }
    }
}
