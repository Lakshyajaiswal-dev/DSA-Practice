class Solution {
    public int singleNonDuplicate(int[] nums) {
       int start =0;
       int end = nums.length-1;
       while(start<end){
        int mid = start +(end-start)/2;
        if(mid%2==0 && nums[mid]!=nums[mid+1]){
            end= mid;
        }
        else if(mid%2==1 && nums[mid]==nums[mid+1]){
                end= mid;
        }
        else{
            start = mid+1;
        }
       }
       return nums[start]; 
    }
}