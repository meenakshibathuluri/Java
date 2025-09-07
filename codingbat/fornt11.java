public int[] front11(int[] a, int[] b) {
  int size = 0;
  if(a.length>0 && b.length>0) {
    size = 2;
  }
  if((a.length<=0 && b.length>0) || (a.length>0 && b.length<=0)) {
    size = 1;
  }
    int[] arr = new int[size];
    int i = 0;
    if(a.length>0) {
      arr[i] = a[0];
      i++;
    }
    if(b.length>0) {
      arr[i] = b[0];
    }
  return arr;
}
