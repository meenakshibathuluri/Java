mport java.util.Scanner;
public class printweekday {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the weekday number");
       int weekday = sc.nextInt();
        if(weekday==1) {
            System.out.println("sunday");
        }else if(weekday==2) {
            System.out.println("monday");
        }else if(weekday==3) {
            System.out.println("tuesday");
        }else if(weekday==4) {
            System.out.println("wednesday");
        }else if(weekday==5) {
            System.out.println("thursday");
        }else if(weekday==6) {
            System.out.println("friday");
        }else if(weekday==7) {
            System.out.println("saturday");
        }else {
            System.out.println("Enter valid weekday number:it should be in between 1to7");
        }
    }
}
