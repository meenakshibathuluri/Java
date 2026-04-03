public class DifferentSyntaxArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30};

        System.out.println(arr.length);
        int[] arr1 = new int[6];
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;

        for(int i=0;i< arr.length;i++) {
            System.out.println(arr1[i]);
        }
    }
}