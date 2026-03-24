import java.util.Scanner;
public class ReadingArrayValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter the array values");
        for(int i=0;i<10;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Print array values: ");
        for(int i=0;i<10;i++) {
            System.out.println(arr[i]);
        }
    }
}
