import java.util.Scanner;
public class BiggestAmoungThreeNumbers {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("enter the values of a:");
          int a = sc.nextInt();
          System.out.println("enter the values of b:");
          int b = sc.nextInt();
          System.out.println("enter the values of c:");
          int c = sc.nextInt();
          if(a>b && a>c) {
              System.out.println("a is bigger");
          } else if(b>a && b>c) {
             System.out.println("b is bigger");
          } else if(c>a && c>b) {
              System.out.println("c is bigger");
          } else if(a==b && b==c && c==a) {
              System.out.println("a and b and c are equals");
          } else if(a==b && c!=0) {
              System.out.println("a and b are equals");
          } else if(a==c && b!=0) {
              System.out.println("a and c are equals");
          } else if(b==c && a!=0) {
              System.out.println("b and c are equals");
          } else {
              System.out.println("a and  b and c are not posiable:");
          }
    }
}
