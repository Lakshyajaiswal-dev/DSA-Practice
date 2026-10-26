class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums[0];
        for(int i=1; i<nums.length; i++){
            nums[i]= n+nums[i];
            n = nums[i];
        }
        return nums;
    }
}