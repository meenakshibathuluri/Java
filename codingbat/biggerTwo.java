public int[] biggerTwo(int[] a, int[] b) {
  int aSum = 0;
  int bSum = 0;
  for(int i=0;i<a.length;i++) {
    aSum = aSum + a[i];
  }
  for(int i=0; i<b.length;i++) {
    bSum = bSum + b[i];
  }
  if(aSum>bSum) {
    return a;
  }else if(bSum>aSum) {
    return b;
  }
  return a;
}
