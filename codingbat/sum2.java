public int sum2(int[] nums) {
  int sum = 0;
  if(nums.length == 0) {
    return sum;
  }else if(nums.length == 1) {
    return nums[0];
  }else {
    for(int i=0;i<2; i++) {
      sum = sum + nums[i];
    }
  }
  return sum;
}
