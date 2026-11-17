class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int ans [] = new int [nums.length];
     for(int i = 0; i<nums.length; i++){
        int target = nums[i];
        int  greater = -1;
       for(int j = i+1; j<2*nums.length; j++){
           if(nums[j%nums.length]>target){
             greater = nums[j%nums.length];
             break;
           }
       }
       ans[i]=greater;
     } 
     return ans;  
    }
}