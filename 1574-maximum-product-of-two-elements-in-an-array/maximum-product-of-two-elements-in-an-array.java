class Solution {
    public int maxProduct(int[] nums) {
        int max = -1;
        int sMax = -1;
        for(int i =0;i<nums.length;i++){
            if(max<nums[i]){
                sMax = max;
                max = nums[i];
            }
            else if(sMax<nums[i]){
                sMax = nums[i];
            }
        }
        return ((max-1) * (sMax-1));
    }
}