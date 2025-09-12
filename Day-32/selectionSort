import java.util.Scanner;
public class selectionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter" + arr.length + "array element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i=0;i<arr.length-2;i++) {
            int minIndex =i;
            for (int j=i+1;j< arr.length;j++) {
                if (arr[j]<arr[minIndex]) {
                   minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
       System.out.println();
    }
}
