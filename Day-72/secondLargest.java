import java.util.Scanner;

public class secondLargestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter" + n + "array element: ");
        for (int i=0;i<=n-1;i++) {
            arr[i] = sc.nextInt();
        }
        int fristLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i=0;i<n;i++) {
            if (arr[i]>fristLargest) {
                secondLargest = fristLargest;
                fristLargest = arr[i];
            }else if(arr[i]>secondLargest && arr[i]<fristLargest) {
                secondLargest =arr[i];
            }
        }
        System.out.println("secondLargest: " + secondLargest);
    }
}