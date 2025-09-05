public int[] plusTwo(int[] a, int[] b) {
  int[] arr = new int[a.length + b.length];
  for(int i=0;i<a.length;i++) {
    arr[i] = a[i];
  }
  int j=0;
  for(int i=a.length;i<arr.length;i++) {
    arr[i] = b[j];
    j++;
  }
  return arr;
}
