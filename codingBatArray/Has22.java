
has22([1, 2, 2]) → true
has22([1, 2, 1, 2]) → false
has22([2, 1, 2]) → false

Ans:

public boolean has22(int[] nums) {
  for(int i = 0;i<nums.length-1;i++){
    if(nums[i] == 2 && nums[i+1]==2){
      return true;
    }
  }
  return false;
}