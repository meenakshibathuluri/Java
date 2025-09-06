public int[] make2(int[] a, int[] b) {
  int[] arr = new int[2];
  int count = 0;
  int j = 0;
  for(int i=0;i<a.length;i++) {
    if(count==2) {
      break;
    }
    arr[j] = a[i];
    j++;
    count++;
  }
  for(int i=0;i<b.length;i++) {
    if(count==2) {
      break;
    }
    arr[j]= b[i];
    j++;
    count++;
  }
  return arr;
}
