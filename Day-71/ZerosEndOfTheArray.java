import java.util.Scanner;

public class ZerosEndOfTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the array element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] newarr = new int[arr.length];
        int j = 0;
        for (int i=0;i<arr.length;i++)  {
            if (arr[i] != 0) {
                newarr[j] = arr[i];
                j++;
            }
        }
        for (int i=0;i<newarr.length;i++) {
            System.out.println(newarr[i]);
        }
    }
}
