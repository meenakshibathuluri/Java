public int CenteredAverage(int[] nums) {
    for(int i=0;i<arr.length;i++) {
        for(int j=0;j<arr.length-i-1;j++) {
            if(arr[j]>arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    int sum = 0;
        for(int i=1;i<=arr.length-2;i++) {
            sum += arr[i];
        }
        int average = sum/(arr.length-2);
        return average;
}