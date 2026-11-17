class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans []=new int [nums.length];
        int i=0; 
        int j = nums.length-1;
        int n= nums.length-1;
        while(i<=j){
          if(nums[i]*nums[i]>nums[j]*nums[j]){
            ans[n]=nums[i]*nums[i];
            i++;
            n--;
          }
          else{
            ans[n]=nums[j]*nums[j];
            j--;
            n--;
          }
        }
        return ans;
    }
}