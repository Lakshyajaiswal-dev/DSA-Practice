class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        int end = nums.length;
        while(i<end){
            int correctIndex = nums[i]-1;
            if(nums[i]!=nums[correctIndex]){
                int temp = nums[i];
               nums[i]= nums[correctIndex];
               nums[correctIndex]=temp;
                
            }
            else{
                i++;
            }
        }
        int n= nums[end-1];
        return n;
    }
}