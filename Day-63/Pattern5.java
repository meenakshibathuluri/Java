import java.util.Scanner;
public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the values of n: ");

        int n = sc.nextInt();
        int value = 0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<i+1;j++) {
                System.out.print(value+=1);
            }
            System.out.println();
        }
    }
}
