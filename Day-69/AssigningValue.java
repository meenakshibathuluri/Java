public class AssigningValue {
    public static void main(String[] args) {
        int[] arr = new int[4];
        int a = 30;
        arr[0] = 100;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[3] = 400;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
    }
}
