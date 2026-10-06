class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int minS =0;
        int maxS =0;
        int sum =0;
          int diff =0;
          int min = Integer.MAX_VALUE;
          int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
             sum += nums[i];
             minS += nums[i];
             maxS += nums[i];
         
           min = Math.min(minS,min);
           max = Math.max(maxS, max);
           if(minS>0){
           minS=0;
           }

           if(maxS<0){
            maxS=0;
           }

            
        }
          diff = sum - min;
        if(max<0){
            return max;
        }
        int result = Math.max(max, diff);
        return result;
    }
}