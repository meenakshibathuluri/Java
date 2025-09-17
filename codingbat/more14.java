public boolean more14(int[] nums) {
    int onesCount = 0;
    int foursCount = 0;
    for(int i=0;i<nums.length:i++) {
        if(nums[i]==1) {
            onesCount++;
        }else {
            foursCount++;
        }
    }
    if(onesCount>foursCount) {
        return true;
    }
    return flase;
}