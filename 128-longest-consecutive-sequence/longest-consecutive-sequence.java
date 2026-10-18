class Solution {
    public int longestConsecutive(int[] nums) { 
        Arrays.sort(nums);
        int n = nums.length;
        if(n==0){
            return 0;

        }
        int streak =1;
        int count=1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1]){
                continue;

            }
            if(nums[i]==nums[i-1]+1){
                streak++;
            }
            else{
                streak=1;
            }
            count = Math.max(count, streak);
        }
        return count;

    }
}
