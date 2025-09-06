public int maxTriple(int[] nums) {
  int largest = Integer.MIN_VALUE;
  for(int i=0;i<nums.length;i++) {
    if(nums[0]>largest) {
      largest = nums[i];
    }
    if(nums[nums.length/2] > largest) {
      largest = nums[nums.length/2];
    }
    if(nums[nums.length-1] > largest) {
      largest = nums[nums.length-1];
    }
  }
  return largest;
}
