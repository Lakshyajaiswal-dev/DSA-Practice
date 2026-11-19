class Solution {
    public List<Long> minOperations(int[] nums, int[] queries) {
        int n = nums.length;
        Arrays.sort(nums);
        long [] preSum = new long[n+1];
        for(int i=0; i<n; i++){
            preSum[i+1]= preSum[i]+nums[i];
        } 
          List<Long> ans = new ArrayList<>();
        for(int i=0; i<queries.length; i++){
            int q = queries[i];
            int low=0;
            int high = n-1;
            int idx = n;
          
             while(low<=high){
                 int mid= low+(high-low)/2;
                 if(nums[mid]>=q){
                 idx = mid;
                 high = mid-1;
                 }
                 else{
                 low = mid+1;
                 }
             }
              long left = (long)q*idx - preSum[idx];
              long right = (preSum[n]-preSum[idx])-(long)q*(n-idx);
              ans.add(left+right);
        }
       
       
           return ans;
    }
}