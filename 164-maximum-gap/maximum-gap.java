class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int  n = nums.length;
        int max = Integer.MIN_VALUE;
        if(n<2){
            return 0;
        }
        for(int i=0; i<n-1; i++){
            int m = nums[i+1]-nums[i];
            max = Math.max(max, m);
        }
        return max;
        
    }
}