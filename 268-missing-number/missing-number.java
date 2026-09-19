class Solution {
    public int missingNumber(int[] nums) {
        int XOR=0;
        int  n = nums.length;
        for(int i=0; i<nums.length; i++){
            XOR ^= i^nums[i];
        }
        XOR^=n;
         return XOR;
    }
   
}