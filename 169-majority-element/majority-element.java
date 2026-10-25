class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int can=0;
        int count=0;
        for(int i=0; i<n; i++){
            if(count==0){
                can = nums[i];
            }
            if(nums[i]==can){
                count++;
            }
            else{
                count--;
            }
        }
        return can;
    }
}