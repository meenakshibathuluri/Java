lucky13([0, 2, 4]) → true
lucky13([1, 2, 3]) → false
lucky13([1, 2, 4]) → false

Ans:

public boolean lucky13(int[] nums) {
  boolean isFound = false;
  for(int i = 0;i<nums.length;i++){
    if(nums[i]==1 || nums[i]==3){
      return isFound;
    }
  }
  
  return true;
  
}