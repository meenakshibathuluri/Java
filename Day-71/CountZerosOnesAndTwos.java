import java.util.Scanner;

public class CountZerosOnesAndTwos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array element:");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        int zeros = 0;
        int ones = 0;
        int twos = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == 0) {
                zeros++;
            } else if(arr[i] == 1) {
                ones++;
            } else {
                twos++;
            }
        }
        System.out.println("Zeros: " + zeros);
        System.out.println("Ones: " + ones);
        System.out.println("Twos: " + twos);
    }
}
