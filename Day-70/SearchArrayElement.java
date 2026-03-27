import java.util.Scanner;

public class SearchArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the value: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the array element: ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be searched:");
        int target = sc.nextInt();

        boolean elementFound = false;

        for(int i=0;i<arr.length;i++) {
            if(arr[i] == target) {
                elementFound = true;
                break;
            }
        }
        System.out.println(elementFound);
    }
}
