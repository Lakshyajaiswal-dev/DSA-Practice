class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
       int n = nums.length;
       int start = 0;
       int end = n-1;
       while(start<end){
        if(nums[start]==nums[start+1]&& start<=nums.length){
            return true;
        }
        start++ ;
        
       }

     return false;
   }
}