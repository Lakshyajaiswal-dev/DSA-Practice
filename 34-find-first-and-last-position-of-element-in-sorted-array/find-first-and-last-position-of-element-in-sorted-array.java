class Solution {
    public int[] searchRange(int[] nums, int target){
        int start = searchRangest(nums,  target);
         int end = searchRangeen(nums, target);
         return new int []{start , end};
         
    }

    public int searchRangest(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int st = -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]==target){
                st = mid;
                end = mid-1;
                
            }
            else if(nums[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
             
        }
             return st;

    }
       
    
    public int searchRangeen(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
         int en= -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]==target){
                 en = mid;
                start = mid+1;
             
            }
            else if(nums[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
            
        }
        return en;
       
    }
}