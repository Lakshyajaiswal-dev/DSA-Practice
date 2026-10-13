class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        long sum =0;
        int i=0;
        int j=n-1;
        while(i<j){
           sum+=nums[j]-nums[i];
           i++;
           j--;
        }
        if (n%2!=0){
            return sum+nums[n/2];
        }
        return sum;
    }
}