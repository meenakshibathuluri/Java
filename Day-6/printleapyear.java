import java.util.Scanner;
class PrintLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if (num%4 ==0) {
            System.out.println(num + "is leap year");
        }else {
            System.out.println(num + "is not leap year");
        }
    }

