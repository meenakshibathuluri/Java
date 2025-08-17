public class countFactorofn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int totalfactor = 0;

        for (int i=1;i<=n;i++) {
            if(n%i == 0) {
                totalfactor++;
            }
        }
        System.out.println("Total Factor" + totalfactor);
    }
}
