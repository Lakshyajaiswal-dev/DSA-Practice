class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums[nums.length/2];
        int count =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>=n){
                count= count+(nums[i]-n);
            }
            else{
                count = count+(n-nums[i]);
            }
        }
        return count;
    }
}