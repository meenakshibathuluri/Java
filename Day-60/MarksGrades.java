import java.util.Scanner;
public class MarksGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of a student:");
        int marks = sc.nextInt();
        if(marks>90) {
            System.out.println("student is outstanding");
        } else if(marks>80) {
            System.out.println("student got A");
        } else if(marks>65) {
            System.out.println("student got B");
        } else if(marks>45) {
            System.out.println("student got C");
        } else if(marks>=35) {
            System.out.println("student got D");
        } else if(marks<35 && marks>0) {
            System.out.println("student got fail");
        } else {
            System.out.println("enter marks between 0 to 100");
        }
    }
}
